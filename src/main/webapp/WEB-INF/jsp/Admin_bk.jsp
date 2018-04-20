<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<%@ page import = "javax.swing.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form>
 <form action="LoginServlet"> 
 Please enter your username <input type="text" name="userNameTF"/><br> 
 Please enter your password <input type="text" name="userPasswordPF"/> 
 <input type="submit" value="submit"> 
 </form>
  
<%
String userName = request.getParameter("userNameTF");
String userPassword = request.getParameter("userPasswordPF");
out.print( "UserName" + userName);
out.print( "Password" + userPassword);

  if(userName.equals("test") && userPassword.equals("test"))
  {
	  out.print( "Successful Validation");
    JOptionPane.showMessageDialog(null,"Login successful!","Message",JOptionPane.INFORMATION_MESSAGE); 
    // place your main class here... example: new L7();
  }
  else 
  {
	  out.print( "Failed Validation");
	  JOptionPane.showMessageDialog(null,"Invalid username and password","Message",JOptionPane.ERROR_MESSAGE);                     
  }  
%>

</body>
</html>