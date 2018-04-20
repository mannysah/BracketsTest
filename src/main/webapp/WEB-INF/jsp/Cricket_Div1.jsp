<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="header.jsp" />
</head>
<body> 
<h1 class="cssheader">CTS - 7 OVERS TOURNAMENT - 28-APRIL-2018</h1>
 <div class="row">
  <div class="sidecolumn">
  	<jsp:include page="Rankings.jsp" />
  </div>
  <div class="maincolumn">
	<div class="cssmenubar">
		<li><a href="Cricket_Home.jsp">Home</a></li>
		<li><a href="Cricket_Team.jsp">Team</a></li>
		<li><a href="Cricket_League.jsp">Leagues</a></li>
		<li><a class="active" href="Cricket_Div1.jsp">Division1 Playoffs</a></li>
		<li><a href="Cricket_Div2.jsp">Division2 Playoffs</a></li>
		<li><a href="Cricket_Images.jsp">Images</a></li>
		<li><a href="Cricket_Admin.jsp">Admin</a></li>
	</div>
	<div><jsp:include page="Div1.jsp" /></div>
  </div>
  <div class="sidecolumn">
  	<jsp:include page="Statistics.jsp" />
  </div>
</div> 
<jsp:include page="footer.jsp" />
</body>
</html>