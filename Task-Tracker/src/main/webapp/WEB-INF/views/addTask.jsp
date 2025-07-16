<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Add Task - Task Tracker</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>➕ Add New Task</h2>
            <p class="subtitle">What would you like to accomplish?</p>
        </div>

        <div class="content">
            <a href="/" class="btn-secondary">← Back to Tasks</a>

            <div class="form-container">
                <form action="/add" method="post">
                    <div class="form-group">
                        <label for="title">Task Title</label>
                        <input type="text" id="title" name="title" required
                               placeholder="Enter your task..." />
                    </div>

                    <button type="submit" class="btn-primary">Add Task</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>