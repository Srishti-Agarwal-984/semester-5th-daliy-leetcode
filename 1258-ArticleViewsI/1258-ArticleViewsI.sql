-- Last updated: 7/31/2025, 5:31:47 PM
# Write your MySQL query statement below
select distinct author_id as id
from Views
where author_id = viewer_id
order by id asc;