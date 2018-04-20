<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<%@ page import="com.league.table.service.FileReader"%>
<%@ page import="com.league.table.model.League"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table {
    width:100%;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 10px;
    text-align: Center;
}
table#t01 tr:nth-child(even) {
    background-color: #eee;
}
table#t01 tr:nth-child(odd) {
   background-color: #fff;
}
table#t01 th {
    background-color: black;
    color: white;
}
</style>
<title>Home</title>
</head>
<h1 align=center>Team Division</h1>
<%  
Date dNow = new Date( );
SimpleDateFormat ft = 
new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
out.print( "<h2 align=\"center\">" + ft.format(dNow) + "</h2>");
%>  
<body>
<% 
  String mytime = "7:20";
  SimpleDateFormat df = new SimpleDateFormat("HH:mm");
  Date d = df.parse(mytime); 
  Calendar cal = Calendar.getInstance();
  cal.setTime(d); 
   %>
        <table id=t01>
        	<tr>
    			<th>Field1</th> 
  			</tr>
            <tr>
                <th>Time</th>
                <th>Match</th>
                <th>Team1</th>
                <th>Team2</th>
                <th>Result</th>
            </tr>
        <%try {
                List<League> leagueList = new ArrayList<League>();
                String fileName = "C:/Users/DURAISK/Documents/Karthi/Personal/Sports/Cricket/CTS 2018/CTS2018_League.txt";
                leagueList = FileReader.readFile(fileName);
                for(League league : leagueList) {
                	cal.add(Calendar.MINUTE, 40);
                    String matTime = df.format(cal.getTime());
                    out.println("<tr>");
                    out.println(matTime+league.getMatchNbr()+league.getTeam1()+league.getTeam2());
                    out.println("</tr>");
                }
            } catch(Exception e) {
               e.printStackTrace();
            }

        %>
        </table>
    </body>
</html>