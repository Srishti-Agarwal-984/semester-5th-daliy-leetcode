-- Last updated: 7/31/2025, 5:33:39 PM
select a.requester_id as id,  count(a.requester_id) as num
from (select  requester_id from RequestAccepted

union all

select accepter_id from RequestAccepted) as a
group by a.requester_id
order by num desc
limit 1;


