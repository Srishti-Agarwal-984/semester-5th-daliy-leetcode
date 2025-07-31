-- Last updated: 7/31/2025, 5:32:01 PM
# Write your MySQL query statement below
select product.product_name,sales.year, sales.price 
from sales
inner join product on sales.product_id=product.product_id;
