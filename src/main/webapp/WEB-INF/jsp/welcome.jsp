<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="header.jsp" />
</head>
<body> 
<h1 class="cssheader">CTS 1111 - 7 OVERS TOURNAMENT - 28-APRIL-2018</h1>
 <div class="row">
  <div class="sidecolumn">
  	<jsp:include page="Rankings.jsp" />
  </div>
  <div class="maincolumn">
  <div id="tabs">
  <ul>
    <li><a href="#tabs-1">Home</a></li>
    <li><a href="#tabs-2">Teams</a></li>
    <li><a href="#tabs-3">Leagues</a></li>
  </ul>
  <div id="tabs-1">
    <p>Hello Home</p>
		<table id="homeTable">
		  <tr>
		    <th>Company</th>
		    <th>Contact</th>
		  </tr>
		  <tr>
		    <td>Alfreds Futterkiste</td>
		    <td>Maria Anders</td>
		  </tr>
		  <tr>
		    <td>Centro comercial Moctezuma</td>
		    <td>Francisco Chang</td>
		  </tr>
		</table>    
  </div>
  <div id="tabs-2">
    <p>Hello Teams</p>

		<table id="teamTable">
		  <tr>
		    <th>Team ID</th>
		    <th>Team Name</th>
		  </tr>
		  <tr>
		    <td>Alfreds Futterkiste</td>
		    <td>Maria Anders</td>
		  </tr>
		  <tr>
		    <td>Centro comercial Moctezuma</td>
		    <td>Francisco Chang</td>
		  </tr>
		</table>    

  </div>
  <div id="tabs-3">
    <p>Hello Leagues 1</p>
    <p>Hello Leagues 2</p>
  </div>
</div>
  </div>
  <div class="sidecolumn">111</div>
</div> 

</body>
</html>