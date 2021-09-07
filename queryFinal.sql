SELECT
    B.cantVentas AS 'Cantidad de Ventas',
    B.ganancias AS 'Ganancias',
    COUNT(*) AS 'Cantidad de Bicis a la Venta'
FROM
    bicicleta A
INNER JOIN bicicleteria B ON
    A.Bicicleteria_idBicicleteria = B.idBicicleteria
WHERE
    B.idBicicleteria = 2;
