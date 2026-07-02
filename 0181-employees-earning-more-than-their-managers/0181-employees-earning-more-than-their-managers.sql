# Write your MySQL query statement below
SELECT e2.name as Employee FROM Employee e1, Employee e2
WHERE e1.id = e2.managerId AND e2.salary > e1.salary;