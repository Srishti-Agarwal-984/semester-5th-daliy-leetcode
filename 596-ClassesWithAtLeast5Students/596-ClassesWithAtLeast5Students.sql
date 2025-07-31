-- Last updated: 7/31/2025, 5:33:40 PM
# Write your MySQL query statement below
select class
from Courses
group by class
having count(student)>4;