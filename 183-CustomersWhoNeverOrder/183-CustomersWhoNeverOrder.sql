-- Last updated: 7/31/2025, 5:36:05 PM
# Write your MySQL query statement below
select (name) as Customers
from Customers
where id not in (select customerId from orders);


