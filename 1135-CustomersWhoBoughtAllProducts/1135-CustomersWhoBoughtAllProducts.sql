-- Last updated: 7/31/2025, 5:32:02 PM
# Write your MySQL query statement below
select customer_id
from Customer
group by customer_id
having count(distinct(product_key))=(select count(*) from Product);

