# Write your MySQL query statement below
SELECT emp2.unique_id , emp.name
FROM Employees as emp
LEFT JOIN EmployeeUNI as emp2
ON emp.id = emp2.id;