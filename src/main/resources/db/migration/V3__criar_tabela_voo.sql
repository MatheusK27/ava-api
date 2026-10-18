CREATE TABLE voo (
                     id BIGINT PRIMARY KEY ,
                     origem VARCHAR(255),
                     destino VARCHAR(255),
                     data_ida DATE,
                     data_volta DATE,
                     aeronave_id BIGINT,
                     classe VARCHAR(255),


                     CONSTRAINT fk_voo_aeronave
                         FOREIGN KEY (aeronave_id) REFERENCES aeronaves (id)
);
