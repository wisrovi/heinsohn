SELECT O.fecha_creacion_registro AS Fecha, SUM(O.valor_total) AS Precio, Pe.nombres AS Cliente  FROM Orden AS O
INNER JOIN Producto AS P ON O.numero_productos_orden = P.id
INNER JOIN Persona AS Pe ON O.cliente = Pe.id
GROUP BY O.fecha_creacion_registro
ORDER BY O.fecha_creacion_registro