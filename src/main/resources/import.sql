INSERT INTO roles (name) VALUES ('ROLE_PASAJERO');
INSERT INTO users(username, password) VALUES ('pasajero','$2a$12$/520Wj.NUhioWlnYlcu8uu9bUzddGpkWV4oXiJFrSVp9gE4wbpKiO');
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO roles (name) VALUES ('ROLE_CONDUCTOR');
INSERT INTO users(username, password) VALUES ('conductor','$2a$12$/520Wj.NUhioWlnYlcu8uu9bUzddGpkWV4oXiJFrSVp9gE4wbpKiO');
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2);


-- Motos Honda
INSERT INTO vehicles (brand, model) VALUES ('Honda', 'CB125F Twister');
INSERT INTO vehicles (brand, model) VALUES ('Honda', 'GL 150 Cargo');
INSERT INTO vehicles (brand, model) VALUES ('Honda', 'Wave 110S');
INSERT INTO vehicles (brand, model) VALUES ('Honda', 'XR 190L');

-- Motos Yamaha
INSERT INTO vehicles (brand, model) VALUES ('Yamaha', 'YBR 125 Z');
INSERT INTO vehicles (brand, model) VALUES ('Yamaha', 'FZ-S FI 3.0');
INSERT INTO vehicles (brand, model) VALUES ('Yamaha', 'Crypton T110');
INSERT INTO vehicles (brand, model) VALUES ('Yamaha', 'XTZ 125');

-- Motos Bajaj
INSERT INTO vehicles (brand, model) VALUES ('Bajaj', 'Pulsar 150 Neon');
INSERT INTO vehicles (brand, model) VALUES ('Bajaj', 'Boxer 150X');
INSERT INTO vehicles (brand, model) VALUES ('Bajaj', 'Discover 125 ST');

-- Motos Suzuki
INSERT INTO vehicles (brand, model) VALUES ('Suzuki', 'Gixxer 150');
INSERT INTO vehicles (brand, model) VALUES ('Suzuki', 'GN 125 F');

-- Marcas Chinas / Otras (Comunes en delivery/taxi)
INSERT INTO vehicles (brand, model) VALUES ('Wanxin', 'WX150-A');
INSERT INTO vehicles (brand, model) VALUES ('Wanxin', 'WX200 Cross');
INSERT INTO vehicles (brand, model) VALUES ('Ronco', 'Panther 200');
INSERT INTO vehicles (brand, model) VALUES ('Ronco', 'X-Treme 200');
INSERT INTO vehicles (brand, model) VALUES ('Ssenda', 'Eco 150');
INSERT INTO vehicles (brand, model) VALUES ('KTM', 'Duke 200');
INSERT INTO vehicles (brand, model) VALUES ('Italika', 'FT150');