FESAT JAVA Comisión 4 - EXAMEN FINAL
Alumno: Adrián Edgardo Camus 27449880

Se adjunta mediante archivo comprimido con formato ZIP con proyecto de NetBeans con código del examen final, script de SQL de creación de base y query del ejercicio 5
AEC_Examen_Final.zip (125kb) 

Ejercicio 4: Interpretación de Diagrama de Entidades y Relaciones (DER). 20%
A partir del DER, responda Verdadero (V) o Falso (F) a las siguientes afirmaciones (asignar a cada afirmación un valor V o F). 
Todas las afirmaciones tienen que tener un valor asignado. Puede haber varios V y varios F:

AFIRMACIÓN																	VERDADERO / FALSO

a) Entre las tablas Bicicleteria y Bicicleta existe una relación 1 a 1. 	FALSO
b) Entre las tablas Bicicleteria y Bicicleta existe una relación 1 a N. 	VERDADERO
c) Entre las tablas Bicicleteria y Bicicleta existe una relación N a N. 	FALSO
d) La clave primaria de la tabla Bicicleta es nroDeSerie. 					VERDADERO
e) La clave foránea de la tabla Bicicleta es nroDeSerie. 					FALSO
f) La tabla Bicicleteria no tiene clave primaria. 							FALSO
g) La tabla Bicicleteria no tiene clave foránea.							VERDADERO

Ejercicio 5: Consultas SQL. 20%
Dado el diagrama de entidad-relación presentado en el ejercicio anterior, escriba una consulta SQL que liste: la cantidad de ventas, ganancias y la cantidad de bicicletas en venta, de la bicicletería cuyo idBicicleteria = 2. 

SELECT
    B.cantVentas AS 'Cantidad de Ventas',
    B.ganancias AS 'Ganancias',
    COUNT(*) AS 'Cantidad de Bicis a la Venta'
FROM    bicicleta A
INNER JOIN bicicleteria B ON
    A.Bicicleteria_idBicicleteria = B.idBicicleteria
WHERE    B.idBicicleteria = 2;
