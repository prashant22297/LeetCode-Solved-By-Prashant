# Write your MySQL query statement below
select event_day as day, emp_id, sum(out_time)-sum(in_time) as total_time
from employees
group by 1,2;