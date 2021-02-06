<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%
String name = request.getParameter("name");
String password = request.getParameter("password");
String year = request.getParameter("year");
String branch = request.getParameter("branch");
Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/adj";
con=DriverManager.getConnection(url,"root","root");
Statement st = null;
st=con.createStatement();
String q= "insert into example values ('" + name + "','" + password + "','" + year+"','" +branch+"')";
int x = st.executeUpdate(q); 
if(x>0){%>
<h1>You can Login</h1>
<%
}
else{
%>
<h1>Fill correctly</h1>
<%} %>
</body>
</html>