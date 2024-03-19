<!DOCTYPE html>
<html>
<head>
    <title>Employee Salary Update</title>
</head>
<body>
    <h2>Update Employee Salary</h2>
    <form action="updateSalary" method="post">
        <label for="employeeId">Employee ID:</label>
        <input type="text" id="employeeId" name="employeeId" required><br><br>
        
        <label for="salary">Salary:</label>
        <input type="text" id="salary" name="salary" required><br><br>
        
        <input type="submit" value="Update Salary">
    </form>
</body>
</html>
