/* Write your PL/SQL query statement below */
Select a.id from Weather a,Weather b
Where a.recordDate=(b.recordDate+1) and a.temperature > b.temperature;