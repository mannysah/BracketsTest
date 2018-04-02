<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="header.jsp" />

<style>
#ts_tabmenu {
    font-size: .75em;
    padding: 20px 0px 0px 20px;
}
#ts_tabmenu ul
{
    line-height: 1em;
    margin: 0px;
    list-style-type: none;
    float: left;
    padding: 0px 0px 0px 5px;
}
#ts_tabmenu ul li
{
    float: left;
}
#ts_tabmenu ul li a
{
    text-decoration: none;
    display: block;
    float: left;
    padding: 0px 0px 0px 10px;
    background: url(tabs.gif) no-repeat left top;
    margin-left: -5px;
    z-index: 0;
    position: relative;
    color: #666666;
}
#ts_tabmenu ul li a strong
{
    font-weight: normal; /* remove the bold effect */
    display: block;
    background: url(tabs.gif) no-repeat right top;
    padding: 6px 10px 7px 5px;
    cursor: pointer;
}
#ts_tabmenu ul li a:hover
{
    position: relative;
    z-index: 5;
    background: url(tabs.gif) no-repeat left bottom;
    color: #000000;
}
#ts_tabmenu ul li a:hover strong
{
    background-image: url(tabs.gif) no-repeat;
    position: relative;
    z-index: 5;
    background-position: right bottom;
}
</style>
<style>

.sidecolumn {
border: 5px solid red;
    float: left;
    width: 22%;
    padding: 10px;
    height: 300px; /* Should be removed. Only for demonstration */
        min-width: 300px; /* 100px x3 = 300 */
    overflow:scroll;
    
}

.maincolumn {
    float: left;
    width: 56%;
    padding: 10px;
    height: 300px; /* Should be removed. Only for demonstration */
        min-width: 300px; /* 100px x3 = 300 */
    overflow:scroll;
    
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}
</style>

</head>
<body> 
<h1 class="cssheader">CTS 1111 - 7 OVERS TOURNAMENT - 28-APRIL-2018</h1>
<!-- <div> -->
<%-- <jsp:include page="Rankings.jsp" /> --%>
<!-- </div> -->
<!-- <!-- <iframe src="Rankings.jsp" height="795" width="400" align="left"></iframe>  --> -->

	
<!-- <ul> -->
<!--   <li><a class="active" href="Cricket_Home.jsp">Home</a></li> -->
<!--   <li><a href="Cricket_Team.jsp">Team</a></li> -->
<!--   <li><a href="Cricket_League.jsp">Leagues</a></li> -->
<!--   <li><a href="Cricket_Div1.jsp">Division1 Playoffs</a></li> -->
<!--   <li><a href="Cricket_Div2.jsp">Division2 Playoffs</a></li> -->
<!--   <li><a href="Cricket_Images.jsp">Images</a></li> -->
<!--   <li><a href="Cricket_Admin.jsp">Admin</a></li> -->
<!-- </ul> -->
<!-- <iframe src="Home.jsp" height="695" width="920" align="center"></iframe> -->
<!-- <iframe src="Statistics.jsp" height="695" width="400" align="right"></iframe>  -->

<%-- <jsp:include page="footer.jsp" /> --%>
 <div class="row">
  <div class="sidecolumn">
  	<jsp:include page="Rankings.jsp" />
  </div>
  <div class="maincolumn">
  <div id="ts_tabmenu">

<ul>
  <li><a class="active" href="/home">Home</a>  </li>
  <li><a href="/home">Team</a></li>
  <li><a href="Cricket_League.jsp">Leagues</a></li>
  <li><a href="Cricket_Div1.jsp">Division1 Playoffs</a></li>
  <li><a href="Cricket_Div2.jsp">Division2 Playoffs</a></li>
  <li><a href="Cricket_Images.jsp">Images</a></li>
  <li><a href="Cricket_Admin.jsp">Admin</a></li>
</ul>
</div>
  </div>
  <div class="sidecolumn">111</div>
</div> 

</body>
</html>