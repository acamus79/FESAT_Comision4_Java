DROP DATABASE IF EXISTS examenfinal;
CREATE DATABASE IF NOT EXISTS examenfinal;

CREATE TABLE IF NOT EXISTS bicicleteria(
idBicicleteria INT NOT NULL,
ganancias VARCHAR(45),
cantVentas INT,
PRIMARY KEY(idBicicleteria)
) ENGINE=innodb;

CREATE TABLE IF NOT EXISTS bicicleta(
nroDeSerie VARCHAR(45) NOT NULL,
modelo VARCHAR(45) NOT NULL,
anio INT(4) UNSIGNED NOT NULL,
precio VARCHAR(45) NOT NULL,
Bicicleteria_idBicicleteria INT NOT NULL,    
PRIMARY KEY(nroDeSerie),
FOREIGN KEY(Bicicleteria_idBicicleteria) REFERENCES bicicleteria(idBicicleteria)
ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=innodb;

/*Bicicleterias*/
INSERT INTO bicicleteria VALUES (1,'54000',2);
INSERT INTO bicicleteria VALUES (2,'148000',7);

/*Bicicletas*/
INSERT INTO bicicleta VALUES ('SN454545','Aero',2018,'28000',1);
INSERT INTO bicicleta VALUES ('SN454445','Aero',2018,'28000',1);
INSERT INTO bicicleta VALUES ('SN454745','Sport',2020,'30000',2);
INSERT INTO bicicleta VALUES ('SN774545','Aero',2018,'28000',2);
INSERT INTO bicicleta VALUES ('SN354545','Sport',2021,'32000',2);
INSERT INTO bicicleta VALUES ('SN994545','Sport',2021,'32000',2);
INSERT INTO bicicleta VALUES ('SN984545','Sport',2021,'32000',2);
INSERT INTO bicicleta VALUES ('SN154000','Aero',2019,'27000',2);
