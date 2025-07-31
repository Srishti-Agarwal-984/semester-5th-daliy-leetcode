-- Last updated: 7/31/2025, 5:28:40 PM
# Write your MySQL query statement below
select teacher_id , count(distinct(subject_id)) as cnt
from Teacher
group by teacher_id;

