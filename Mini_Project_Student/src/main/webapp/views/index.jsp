<%@ page language="java" contentType="text/html" %>
<html>
<head>
    <title>Student Form</title>
    <!-- ✅ Correct path to static folder -->
    <link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>

    <form action="result" method="post">
        <h2>Enter Student Details</h2>

        <label for="id">ID:</label>
        <input type="text" name="id" id="id" /><br>

        <label for="name">Name:</label>
        <input type="text" name="name" id="name" /><br>

        <label for="marks">Marks:</label>
        <input type="text" name="marks" id="marks" /><br>

        <input type="submit" value="Submit" />
    </form>

</body>
</html>
