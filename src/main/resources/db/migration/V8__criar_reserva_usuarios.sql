CREATE TABLE reservas (
                          id BIGSERIAL PRIMARY KEY,
                          codigo_reserva VARCHAR(6) NOT NULL UNIQUE
);

CREATE TABLE reserva_usuarios (
                                  reserva_id BIGINT NOT NULL,
                                  usuario_id BIGINT NOT NULL,

                                  PRIMARY KEY (reserva_id, usuario_id),

                                  CONSTRAINT fk_reserva_usuarios_reserva
                                      FOREIGN KEY (reserva_id) REFERENCES reservas (id),

                                  CONSTRAINT fk_reserva_usuarios_usuario
                                      FOREIGN KEY (usuario_id) REFERENCES usuario (id)
);

CREATE TABLE reserva_voos (
                              reserva_id BIGINT NOT NULL,
                              voo_id BIGINT NOT NULL,

                              PRIMARY KEY (reserva_id, voo_id),

                              CONSTRAINT fk_reserva_voos_reserva
                                  FOREIGN KEY (reserva_id) REFERENCES reservas (id),

                              CONSTRAINT fk_reserva_voos_voo
                                  FOREIGN KEY (voo_id) REFERENCES voo (id)
);