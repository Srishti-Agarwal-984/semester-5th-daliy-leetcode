-- Last updated: 7/31/2025, 5:33:37 PM
# Write your MySQL query statement

select max(num) as num
from (select num
from MyNumbers
group by (num)
having count(num)=1 
order by num desc)
AS unique_numbers;;

 