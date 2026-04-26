<%@ page import="java.sql.*" %>

<html>
<head>
<title>Salary Report</title>
</head>
<body>

<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/employee", "root", "pandu@142");

    String ch = request.getParameter("ch");

    if(ch == null || ch.equals("")) {
        out.println("Please enter a character");
        return;
    }

    PreparedStatement ps = con.prepareStatement(
        "SELECT * FROM Emp WHERE Emp_Name LIKE ?");

    ps.setString(1, ch + "%");

    ResultSet rs = ps.executeQuery();
%>

<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
while(rs.next()){
%>
Emp_No : <%= rs.getInt("Emp_NO") %>
Emp_Name: <%= rs.getString("Emp_Name") %>
Basic : <%= rs.getInt("Basicsalary") %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
}
%>
</pre>

<%
con.close();
} catch(Exception e){
    out.println("Error: " + e.getMessage());
}
%>

</body>
</html>