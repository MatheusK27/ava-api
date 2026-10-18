CREATE TABLE aeronaves (
                           id BIGSERIAL PRIMARY KEY,
                           aeronave VARCHAR(255)  NOT NULL ,
                           classes VARCHAR(255)  NOT NULL ,
                           total_assentos INTEGER NOT NULL
);