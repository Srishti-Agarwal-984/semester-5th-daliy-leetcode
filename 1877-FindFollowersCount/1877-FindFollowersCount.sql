-- Last updated: 7/31/2025, 5:30:20 PM
# Write your MySQL query statement below
select distinct(user_id), count(distinct(follower_id)) as followers_count
from Followers
group by user_id;
