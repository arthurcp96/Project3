-- Listar todos los clientes mostrando los datos del turno
select * from clientes c join turnos t on c.id=t.id
            order by c.id;
            
-- Listar todos los abogados mostrando datos del turno
select * from abogados a join turnos t on a.id=t.id
            order by a.id;
            
-- Listar turnos mostrando datos del abogado
select * from turnos t join abogados a on t.id=a.id
            order by t.id;
            
-- Selecciona los turnos con el nombre del abogado          
SELECT turnos.id, abogados.nombre
FROM turnos
INNER JOIN abogados
ON turnos.abogados_id = abogados.id;