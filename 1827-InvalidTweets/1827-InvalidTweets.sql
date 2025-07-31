-- Last updated: 7/31/2025, 5:30:24 PM
# Write your MySQL query statement below
select tweet_id
from Tweets
where (length(content)>15);