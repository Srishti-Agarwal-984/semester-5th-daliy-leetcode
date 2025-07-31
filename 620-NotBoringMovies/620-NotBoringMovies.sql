-- Last updated: 7/31/2025, 5:33:36 PM
# Write your MySQL query statement below
select * from cinema 
    where (id%2=1 and description!="boring")
    order by rating desc;
