INSERT INTO roles (name) VALUES ('ROLE_PASAJERO');
INSERT INTO users(username, password) VALUES ('pasajero','$2a$12$/520Wj.NUhioWlnYlcu8uu9bUzddGpkWV4oXiJFrSVp9gE4wbpKiO');
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO roles (name) VALUES ('ROLE_CONDUCTOR');
INSERT INTO users(username, password) VALUES ('conductor','$2a$12$/520Wj.NUhioWlnYlcu8uu9bUzddGpkWV4oXiJFrSVp9gE4wbpKiO');
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2);