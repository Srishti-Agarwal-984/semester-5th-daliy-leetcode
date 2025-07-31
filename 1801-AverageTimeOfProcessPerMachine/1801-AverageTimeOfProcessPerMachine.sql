-- Last updated: 7/31/2025, 5:30:27 PM
# Write your MySQL query statement below
-- select distinct(machine_id) ,avg( (timestamp)))
-- from activity
-- group by timestamp;
-- select a1.machine_id, round(avg(a2.timestamp-a1.timstamp),3) from activity a1, activity a2
-- where a1.machine_id = a2.machine_id and a1.process_id = a2.process_id and a2.timestamp>a1.timestamp
-- group by a1.machine_id;
# select distinct(machine_id), avg(ed-st)
# from(
# select machine_id, process_id,
# sum(case when activity_type = "start" than timestamp end) as st,
# sum(case when activity_type = "end" than timestamp end) as ed,
# from activity
# group by machine_id, process_id;) group by  processing_time


select abc.machine_id, round(avg(abc.ed- abc.st),3) as processing_time
from (select machine_id, process_id,
sum(case when activity_type = 'start' then timestamp end) as st,
sum(case when activity_type = 'end' then timestamp end) as ed
from activity
group by machine_id, process_id) as abc
group by abc.machine_id
