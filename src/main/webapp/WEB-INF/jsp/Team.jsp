<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<%@ page import="com.team.table.service.FileReader"%>
<%@ page import="com.team.table.model.Team"%>

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
<h1 align=center>Team Registered</h1>
<body>
        <table id=t01>
            <tr>
                <th>TeamName</th>
                <th>Captain</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Waiver</th>
                <th>Pool</th>
            </tr>
        <%  try {
                List<Team> teamList = new ArrayList<Team>();
                String fileName = "C:/Users/DURAISK/Documents/Karthi/Personal/Sports/Cricket/CTS 2018/CTS2018_TeamList.txt";
                teamList = FileReader.readFile(fileName);
                for(Team team : teamList) {
                    out.println("<tr>");
                    out.println(team.getTeamName()+team.getCaptainName()+team.getEmail()+team.getPhNo()+team.getWaiver()+team.getPool());
                    out.println("</tr>");
                }
            } catch(Exception e) {
               e.printStackTrace();
            }

        %>
        </table>
    </body>
</html>