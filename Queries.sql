
--Para los dos Queires se duró aproximadamente entre 30 y 40 minutos en cada una.

/*Ejercicio 3 – Consultas
1. Create a query that returns the top 3 car brands most sold (i.e., having the most car brand sales) during first
and third quarter of year 2015.*/

--Se crea el procedimiento
create or replace function marca_mas_vendida return varchar
as
    --Se definen las variables
    vMake varchar;
    vSalesPrice numeric;
    vQuarterAndYear timestamp;
begin
--Se realiza un la funcion max en el select para saber el salario mas alto el cual sera ordenado de forma desc
--donde se muestren los tres primeros, ademas de dos inner join con las tablas invoicesLines stock y 
--dataDimension y invoiceLines. Po ultimo se realiza un funcion between con el rango del quatrimestre 1 2015 y 
--quatrimestre 3 2015. Se agrupa salePrice donde aparezca ordenada de forma descendente.
select s.make, d.quarterAndYear, max(i.salePrice) into vMake, vSalesPrice, vQuarterAndYear 
from invoiceLines i 
inner join stock s on s.stock_id = i.stock_id
inner join dataDimension d on d.invoice_Id = i.invoice_Id
where d.quarterAndYear between 'Quarter 1 2015' and 'Quarter 3 2015' 
group by s.make, d.quarterAndYear,i.salePrice order by 3 desc; 
end;

execute marca_mas_vendida;


/*
2. Create a query that shows the top 3 most sold car colors (i.e., having the most car color sales) for each
quarter for the years 2012,2013,2014,2015
*/

--Se crea el procedimiento
create or replace function colores_mas_vendidos return varchar
as
    --Se definen las variable y su tipo
    vColor varchar;
    vSalePrice numeric;
begin
    --Se realiza la funcion sum para saber cual tiene los colores mas vendidos, ademas de 
    --realizar dos inner join de las tablas invoicesLines y stock y colors con Stock.
    --En el where realizamos la funcion between para establecer el rango entre año 2012 y 2015.
    select sum(c.color), i.salePrice into vColor, vSalePrice 
    from invoiceLines i 
    inner join stock s on s.stock_id = i.stock_id
    inner join Colors c on s.color_id = c.color_id
    where i.quarterAbbrAndYear between '01-01-2012' AND '01-01-2015'
    group by c.color, i.salePrice order by 3 desc;
end;

execute colores_mas_vendidos;



