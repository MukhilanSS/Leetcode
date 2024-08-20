# Write your MySQL query statement below
Select a.name from employee a join 
(Select managerId from employee group by managerId having count(*)>=5) b 
on a.id=b.managerId;
