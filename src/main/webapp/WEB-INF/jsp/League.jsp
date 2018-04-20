<%@ page language = "java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding = "ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<%@ page import = "com.compteam.table.service.compare"%>
<%@ page import = "com.league.table.model.League"%>
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
  SimpleDateFormat df = new SimpleDateFormat("HH:mm");
  Calendar cal = Calendar.getInstance();
   %>
        <%try {
                List<League> leagueList = new ArrayList<League>();             
                String fileName = "C:/Users/DURAISK/Documents/Karthi/Personal/Sports/Cricket/CTS 2018/CTS2018_League.txt";
                leagueList = compare.readFile(fileName);
                String first = "Y";
                String tempfldnbr = " ";
                for(League league : leagueList) 
                {   
                	if (tempfldnbr.equals(league.getFieldNbr()))
                	{
                		cal.add(Calendar.MINUTE, 40);
                    	String matTime = df.format(cal.getTime());
                    	out.println("<tr>");
                    	out.println("<td>"+matTime+"</td>"+league.getMatchNbr()+league.getTeam1()+league.getTeam2());
                    	out.println("</tr>");	
                	}
                	else
                	{
                		if (first == "Y")
                		{
                			first = "N";
                			} else
                		{
                			out.println("</table>");
                		}
                    	out.println("<table id=t01><tr><th>");
                    	String[] flnr = league.getFieldNbr().split(">");
                		out.println(flnr[1]);
                		out.println("</th></tr>");
                    	out.println("<tr><th>Time</th><th>Match</th><th>Team1</th><th>Team2</th><th>Result</th></tr>");
                    	tempfldnbr = league.getFieldNbr();
                    	String mytime = "7:20";
                    	Date d = df.parse(mytime); 
                    	cal.setTime(d);cal.add(Calendar.MINUTE, 40);
                    	String matTime = df.format(cal.getTime());
                    	out.println("<tr>");
                    	out.println("<td>"+matTime+"</td>"+league.getMatchNbr()+league.getTeam1()+league.getTeam2());
                    	out.println("</tr>");                    	
                	}
                }
            } catch(Exception e) {
               e.printStackTrace();
            }

        %>
    </table>    
    </body>
</html>