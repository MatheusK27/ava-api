CREATE TABLE aeronave_classes (
                                  aeronave_id BIGINT NOT NULL,
                                  classe VARCHAR(255) NOT NULL,

                                  PRIMARY KEY (aeronave_id, classe),

                                  CONSTRAINT fk_aeronave_classes
                                      FOREIGN KEY (aeronave_id) REFERENCES aeronaves (id)
);

-- Transfere as classes já cadastradas.
INSERT INTO aeronave_classes (aeronave_id, classe)
SELECT id, classes
FROM aeronaves
WHERE classes IS NOT NULL;

-- Remove a coluna antiga.
ALTER TABLE aeronaves DROP COLUMN classes;