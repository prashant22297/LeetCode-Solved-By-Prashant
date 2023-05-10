# Write your MySQL query statement below
select user_id, Concat(UPPER(SUBSTR(name, 1, 1)),LOWER(SUBSTR(name,2,length(name))))  as name from Users Order by user_id;