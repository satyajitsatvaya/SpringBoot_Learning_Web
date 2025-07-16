<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Task Tracker</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>📝 Task Tracker</h2>
            <p class="subtitle">Stay organized and get things done!</p>
        </div>

        <div class="content">
            <a href="/add" class="add-btn">➕ Add New Task</a>

            <ul class="task-list">
                <c:forEach var="task" items="${tasks}">
                    <li class="${task.completed ? 'done' : 'pending'}">
                        <div class="task-content">
                            <span class="task-status-icon">
                                ${task.completed ? "✅" : "⌛"}
                            </span>
                            <span class="task-text">
                                ${task.title}
                            </span>
                        </div>
                        <div class="actions">
                            <c:if test="${!task.completed}">
                                <a href="/complete/${task.id}" class="complete">Mark Done</a>
                            </c:if>
                            <a href="/delete/${task.id}" class="delete">Delete</a>
                        </div>
                    </li>
                </c:forEach>
            </ul>

            <c:if test="${empty tasks}">
                <div class="empty-state">
                    <div class="empty-state-icon">📋</div>
                    <h3>No tasks yet!</h3>
                    <p>Add your First Task</p>
                </div>
            </c:if>
        </div>
    </div>
</body>
</html>