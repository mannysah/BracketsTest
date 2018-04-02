<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet" type="text/css" href="\CTS 2018\CricketHeader.css">
<jsp:include page="CricketHeader.css"/>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<title>Cricket Website</title>
</head>
<body> 
<h1 class="cssheader">CTS - 7 OVERS TOURNAMENT - 28-APRIL-2018</h1>
<iframe src="Rankings.jsp" height="795" width="400" align="left"></iframe> 
	
<ul>
  <li><a href="Cricket_Home.jsp">Home</a></li>
  <li><a href="Cricket_Team.jsp">Team</a></li>
  <li><a href="Cricket_League.jsp">Leagues</a></li>
  <li><a href="Cricket_Div1.jsp">Division1 Playoffs</a></li>
  <li><a href="Cricket_Div2.jsp">Division2 Playoffs</a></li>
  <li><a class="active" href="Cricket_Images.jsp">Images</a></li>
</ul>
<iframe src="Images.jsp" height="695" width="920" align="center"></iframe>
<iframe src="Statistics.jsp" height="695" width="400" align="right"></iframe> 

<footer>
<h1 class="cssfooter">CTS 2018 - 7 OVERS TOURNAMENT FOOTER</h1>
</footer>

</body>
</html>