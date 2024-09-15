/* Write your PL/SQL query statement below */
SELECT MAX(SALARY) AS SecondHighestSalary 
FROM employee WHERE salary < (
    SELECT MAX(Salary) from Employee
);