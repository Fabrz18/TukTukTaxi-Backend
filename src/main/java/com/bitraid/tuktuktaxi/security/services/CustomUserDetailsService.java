package com.bitraid.tuktuktaxi.security.services;


import com.kubotoys.inversioneskubotoys.entities.UsuarioSistema;
import com.kubotoys.inversioneskubotoys.repositories.UsuarioSistemaRepository;
import com.kubotoys.inversioneskubotoys.security.entities.User;
import com.kubotoys.inversioneskubotoys.security.repository.UserRepository;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    private final UsuarioSistemaRepository usuarioRepository;

    public CustomUserDetailsService(UserRepository userRepository, UsuarioSistemaRepository usuarioRepository) {
        this.userRepository = userRepository;
        this.usuarioRepository =usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        if (!"admin".equals(username)) {
            UsuarioSistema usuario = usuarioRepository.findByUsername(username)
                    .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

            if (!usuario.isActivo()) {
                throw new DisabledException("La cuenta está desactivada");
            }
        }

        Set<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toSet());

        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .authorities(authorities)
                .build();
    }
}
