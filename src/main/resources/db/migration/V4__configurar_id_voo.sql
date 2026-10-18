CREATE TABLE voo (
                     id BIGSERIAL PRIMARY KEY,
                     origem VARCHAR(255) NOT NULL,
                     destino VARCHAR(255) NOT NULL,
                     data_ida DATE NOT NULL,
                     data_volta DATE NOT NULL,
                     aeronave_id BIGINT,
                     classe VARCHAR(255),

                     CONSTRAINT fk_voo_aeronave
                         FOREIGN KEY (aeronave_id) REFERENCES aeronaves (id)
);