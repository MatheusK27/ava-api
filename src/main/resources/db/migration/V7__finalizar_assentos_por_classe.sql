ALTER TABLE aeronave_classes
    ALTER COLUMN quantidade_assentos SET NOT NULL;

ALTER TABLE aeronave_classes
    ADD CONSTRAINT ck_quantidade_assentos_positiva
        CHECK (quantidade_assentos > 0);

ALTER TABLE aeronaves
DROP COLUMN total_assentos;