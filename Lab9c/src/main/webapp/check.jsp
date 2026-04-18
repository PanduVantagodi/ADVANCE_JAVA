<%@ page language="java" %>
<html>
<head>
    <title>Check Session</title>
</head>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Hello <%= user %>! Session is still active.</h2>
<%
    } else {
%>
        <h2>Session expired!</h2>
<%
    }
%>

</body>
</html>