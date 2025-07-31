-- Last updated: 7/31/2025, 5:31:08 PM
select Employeeuni.unique_id , Employees.name from Employeeuni
right join Employees on employees.id=employeeuni.id;