<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<jsp:include page="CricketHeader.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<title>Cricket Website</title>

  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="../css/styles.css">
  <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  
  
  <script>
  
  
  $( function() {
	  alert('hello');
	  callAjax("/home");
	  
	    $( "#tabs" ).tabs({
 	    	activate: function (event, ui) {
	            var active = $('#tabs').tabs('option', 'active');
	            $("#tabid").html('the tab id is ' + $("#tabs ul>li a").eq(active).attr("href"));
	            console.info('YYYYY');
	            console.info(active);
	            console.info('HELLO COMPARISON'+ active==0);

	            if(active==0){
		            	console.log('Home tab is selected');
		            	callAjax("/home");
		            	console.log('completed Ajax');
		               	callAjax("/point");
		            	console.log('completed Point Ajax');
	            }
	            
	            if(active==1){
		            	console.log('Team Tab is selected');
		            	callAjax("/teams");
		            	console.log('completed Ajax');
		            	
	            }
	            if(active==2){
	            	console.log('Schedule Tab is selected');
	            	callAjax("/leagues");
	            	console.log('completed Ajax');
	            	
            }
	            if(active==3){
	            	console.log('Scores Tab is selected');
	            	callAjax("/score");
	            	console.log('completed Ajax');
	            	
            }
	            if(active==4){
	            	console.log('Results Tab is selected');
	            	callAjax("/result");
	            	console.log('completed Ajax');
	            	
            }
	            if(active==5){
	            	console.log('Players Tab is selected');
	            	callAjax("/player");
	            	console.log('completed Ajax');
	            	
            }
// 	            if(active==6){
// 	            	console.log('Team Entry Tab is selected');
// 	            	callAjax("/teamEntry");
// 	            	console.log('completed Ajax');
	            	
//             }

	            if(active==7){
	            	callAjax("/teamTeamName");
	            	console.log('Players Entry Tab is selected');
	            	callAjax("/roleRoleDescription");
	            	console.log('completed Ajax');
	            	
            }
	            
	            if(active==8){
	            	console.log('Scores Entry Tab is selected');
	            	callAjax("/scheduleScheduleId");
	            	console.log('ScheduleId successful');	
	            	callAjax("/teamTeamName");
	            	console.log('teamTeamName successful');
	            	callAjax("/playerName");
	            	console.log('playerName successful');
	            	callAjax("/wicketDescription");
	            	console.log('completed Ajax');
	            	console.log('completed Ajax');
	            	
            }

 	    		}
	    });	  
  });
		   
  </script>
  
<!--  AJAX FUNCTION -->
<script>
function callAjax(controllerName, callback)
{
	console.log(callback);
    $.ajax({
  	  type: "GET",
  	  url: controllerName,
  	  success: function(data){
  		  console.log('successful call');
  		  //jsonData = $.parseJSON(data);
  		  
  		  if(controllerName=="/home")
  		  {
  			homeCallBack(data);
  		  }
  		  else if(controllerName=="/teams")
  		  {
  			teamCallBack(data);
  		  }
  		else if(controllerName=="/leagues")
		  {
			scheduleCallBack(data);
		  }
  		else if(controllerName=="/score")
		  {
			scoreCallBack(data);
		  }
  		else if(controllerName=="/result")
		  {
			resultCallBack(data);
		  }
  		else if(controllerName=="/player")
		  {
			playerCallBack(data);
		  }
//   		else if(controllerName=="/teamEntry")
// 		  {
// 			  playerCallBack(data);
// 		  }
		else if (controllerName=="/teamTeamName")
		{
			console.log('header teamNamecallback start');
			teamTeamNameCallBack(data);
			console.log('header teamNamecallback end');
		}
		else if (controllerName=="/roleRoleDescription")
		{
			console.log('header roleDescriptioncallback start');
			roleRoleDescriptionCallBack(data);
			console.log('header roleDescriptioncallback end');
		}
		else if (controllerName=="/scheduleScheduleId")
		{
			console.log('header resultentry scheduleidcallback start');
			scheduleScheduleIdCallBack(data);
			console.log('header resultentry scheduleidcallback end');
		}
		else if (controllerName=="/playerName")
		{
			console.log('header playerNamecallback start');
			playerNameCallBack(data);
			console.log('header playerNamecallback end');
		}	
		else if (controllerName=="/wicketDescription")
		{
			console.log('header wicketDescriptioncallback start');
			wicketDescriptionCallBack(data);
			console.log('header wicketDescriptioncallback end');
		}
		else if (controllerName=="/point")
		{
			console.log('header pointcallback start');
			pointCallBack(data);
			console.log('header pointcallback end');
		}
  	  },
  	  dataType: "json"
  	});	


    return;
}

function teamTeamNameCallBack(data)
{
	console.log('inside playerEntry CallBack');
	console.log($("#teamTeamNameDropDown").html());
				
 					var dropDown = "<select>" ;
			for (i = 0; i < data.length; i++) {
	 			dropDown = dropDown + "<option value='" + data[i].id + "'>"+ data[i].teamName + "</option>";  
	 		} 
	 		dropdown =dropDown + "</select>"; 
	 console.log(dropdown);
	 $("#teamTeamNameDropDown_pe1").html(dropdown);
	 $("#teamTeamNameDropDown_pe2").html(dropdown);
	 $("#teamTeamNameDropDown_pe3").html(dropdown);
	 $("#teamTeamNameDropDown_pe4").html(dropdown);
	 $("#teamTeamNameDropDown_pe5").html(dropdown);
	 $("#teamTeamNameDropDown_pe6").html(dropdown);
	 $("#teamTeamNameDropDown_pe7").html(dropdown);
	 $("#teamTeamNameDropDown_pe8").html(dropdown);
	 $("#teamTeamNameDropDown_pe9").html(dropdown);
	 $("#teamTeamNameDropDown_pe10").html(dropdown);
	 $("#teamTeamNameDropDown_se1").html(dropdown);
	 $("#teamTeamNameDropDown_se2").html(dropdown);
	 $("#teamTeamNameDropDown_se3").html(dropdown);
	 $("#teamTeamNameDropDown_se4").html(dropdown);
	 $("#teamTeamNameDropDown_se5").html(dropdown);
	 $("#teamTeamNameDropDown_se6").html(dropdown);
	 $("#teamTeamNameDropDown_se7").html(dropdown);
}

function roleRoleDescriptionCallBack(data)
{
	console.log('inside playerEntryRole CallBack');
	console.log($("#roleRoleDescriptionDropDown").html());
				
 					var roleDropDown = "<select>" ;
			for (i = 0; i < data.length; i++) {
	 			roleDropDown = roleDropDown + "<option value='" + data[i].id + "'>"+ data[i].roleDescription + "</option>";  
	 		} 
	 		roledropdown =roleDropDown + "</select>"; 
	 console.log(roledropdown);
	 $("#roleRoleDescriptionDropDown_pe1").html(roledropdown);
	 $("#roleRoleDescriptionDropDown_pe2").html(roledropdown);
	 $("#roleRoleDescriptionDropDown_pe3").html(roledropdown);
	 $("#roleRoleDescriptionDropDown_pe4").html(roledropdown);
	 $("#roleRoleDescriptionDropDown_pe5").html(roledropdown);
	 $("#roleRoleDescriptionDropDown_pe6").html(roledropdown);
	 $("#roleRoleDescriptionDropDown_pe7").html(roledropdown);
	 $("#roleRoleDescriptionDropDown_pe8").html(roledropdown);
	 $("#roleRoleDescriptionDropDown_pe9").html(roledropdown);
	 $("#roleRoleDescriptionDropDown_pe10").html(roledropdown);
			
}

function wicketDescriptionCallBack(data)
{
	console.log('inside wicketDescription CallBack');
	console.log($("#wicketDescriptionDropDown_bat").html());
				
 					var wicketDropDown = "<select>" ;
			for (i = 0; i < data.length; i++) {
	 			wicketDropDown = wicketDropDown + "<option value='" + data[i].id + "'>"+ data[i].wicketDescription + "</option>";  
	 		} 
	 		wicketdropdown =wicketDropDown + "</select>"; 
	 console.log(wicketdropdown);
	 $("#wicketDescriptionDropDown_bat_se1").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_bat_se2").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_bat_se3").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_bat_se4").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_bat_se5").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_bat_se6").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_bat_se7").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_ball_se1").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_ball_se2").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_ball_se3").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_ball_se4").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_ball_se5").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_ball_se6").html(wicketdropdown);
	 $("#wicketDescriptionDropDown_ball_se7").html(wicketdropdown);
			
}

function scheduleScheduleIdCallBack(data)
{
	console.log('inside scheduleScheduleId CallBack');
	console.log($("#scheduleScheduleIdDropDown").html());
				
 					var sidDropDown = "<select>" ;
			for (i = 0; i < data.length; i++) {
	 			sidDropDown = sidDropDown + "<option value='" + data[i].id + "'>"+ data[i].scheduleMatchName + "</option>";  
	 		} 
	 		siddropdown =sidDropDown + "</select>"; 
	 console.log(siddropdown);
	 $("#scheduleScheduleIdDropDown_se1").html(siddropdown);
	 $("#scheduleScheduleIdDropDown_se2").html(siddropdown);
	 $("#scheduleScheduleIdDropDown_se3").html(siddropdown);
	 $("#scheduleScheduleIdDropDown_se4").html(siddropdown);
	 $("#scheduleScheduleIdDropDown_se5").html(siddropdown);
	 $("#scheduleScheduleIdDropDown_se6").html(siddropdown);
	 $("#scheduleScheduleIdDropDown_se7").html(siddropdown);				
}

function playerNameCallBack(data)
{
	console.log('inside playerEntry CallBack');
	console.log($("#playerNameDropDown").html());
				
 					var pdropDown = "<select>" ;
			for (i = 0; i < data.length; i++) {
	 			pdropDown = pdropDown + "<option value='" + data[i].id + "'>"+ data[i].playerFirstName + "</option>";  
	 		} 
	 		pdropdown =pdropDown + "</select>"; 
	 console.log(pdropdown);
	 $("#playerNameDropDown_se1").html(pdropdown);
	 $("#playerNameDropDown_se2").html(pdropdown);
	 $("#playerNameDropDown_se3").html(pdropdown);
	 $("#playerNameDropDown_se4").html(pdropdown);
	 $("#playerNameDropDown_se5").html(pdropdown);
	 $("#playerNameDropDown_se6").html(pdropdown);
	 $("#playerNameDropDown_se7").html(pdropdown);
}

function homeCallBack(jsonData)
{
	console.log('inside homeCallBack11');
	console.log(jsonData);
	
	console.log($('#homeTable'));
	
	var tableBody = "";
	$.each(jsonData, function(i, item) {
		console.log(i);
		console.log(item);
		row = "<tr> <td>" + item.id + "</td><td>" + item.content + "</td></tr>";

		tableBody = tableBody + row;        
    });

	
	console.log(tableBody);
	$("#homeTable tbody").html(tableBody);
}

function pointCallBack(jsonData)
{
	console.log('inside pointCallBack11');
	console.log(jsonData);
	
	console.log($('#pointTable'));
	
	var tableBody = "";
	$.each(jsonData, function(i, item) {
		console.log(i);
		console.log(item);
		row = "<tr> <td>" + item.id + "</td><td>" + item.content + "</td></tr>";

		tableBody = tableBody + row;        
    });

	
	console.log(tableBody);
	$("#pointTable tbody").html(tableBody);
}

function teamCallBack(jsonData)
{
	console.log('inside teamCallBack11');
	console.log(jsonData);
	console.log('inside display team');
	console.log($('#teamTable'));
	
	var tableBody = "";
	$.each(jsonData, function(i, item) {
		console.log(i);
		console.log(item);
		//row = "<tr> <td>" + item.teamId + "</td><td>" + item.teamName + "</td></tr>";
		row = "<tr> <td>" + item.teamName + "</td><td>" + item.teamRegistered + "</td><td>" + item.teamPaid + "</td><td>" + item.teamWaiver +"</td><td>" + item.teamGroupId + "</td></tr>";

		tableBody = tableBody + row;        
    });

	
	console.log(tableBody);
	$("#teamTable tbody").html(tableBody);
}

function scheduleCallBack(jsonData)
{
	console.log('inside scheduleCallBack11');
	console.log(jsonData);
	
	console.log($('#scheduleTable'));
	
	var tableBody = "";
	$.each(jsonData, function(i, item) {
		console.log(i);
		console.log(item);
		//row = "<tr> <td>" + item.teamId + "</td><td>" + item.teamName + "</td></tr>";
		console.log(item.scheduleGroundId);
		console.log(item.scheduleTime);
		console.log(item.scheduleMatchName);
		console.log(item.scheduleTeam1GroupId);
		console.log(item.scheduleTeam2GroupId);
		console.log(item.scheduleWinnerTeamId);
		console.log(item.scheduleLoserTeamId);
		console.log(item.scheduleTied);
		console.log(item.scheduleNr);
		row = "<tr> <td>" + item.scheduleMatchName + "</td><td>" + item.scheduleTime + "</td><td>" + item.scheduleGroundId + "</td><td>" + item.scheduleTeam1GroupId + "</td><td>" + item.scheduleTeam2GroupId + "</td><td>" + item.scheduleWinnerTeamId + "</td><td>" + item.scheduleLoserTeamId + "</td><td>" + item.scheduleTied + "</td><td>" + item.scheduleNr + "</td></tr>";

		tableBody = tableBody + row;        
    });

	
	console.log(tableBody);
	$("#scheduleTable tbody").html(tableBody);
}

function scoreCallBack(jsonData)
{
	console.log('inside scoreCallBack11');
	console.log(jsonData);
	
	console.log($('#scoreTable'));
	
	var tableBody = "";
	$.each(jsonData, function(i, item) {
		console.log(i);
		console.log(item);
		//row = "<tr> <td>" + item.teamId + "</td><td>" + item.teamName + "</td></tr>";
		console.log(item.scoreId);
		console.log(item.scoreScheduleId);
		console.log(item.scoreTeamId);
		console.log(item.scorePlayerId);
		console.log(item.scoreBattingRuns);
		console.log(item.scoreBattingBalls);
		console.log(item.scoreBatting4s);
		console.log(item.scoreBatting6s);
		console.log(item.scoreBattingOut);
		console.log(item.scoreBattingWicketId);
		console.log(item.scoreBowlingRuns);
		console.log(item.scoreBowlingBalls);
		console.log(item.scoreBowlingWkts);
		console.log(item.scoreBowlingComments);
		row = "<tr> <td>" + item.scoreScheduleId + "</td><td>" + item.scoreTeamId + "</td><td>" + item.scoreBattingRuns + "</td><td>" + item.scoreBattingBalls +"</td><td>" + item.scoreBowlingWkts + "</td></tr>";

		tableBody = tableBody + row;        
		console.log(tableBody);
    });

	
	console.log(tableBody);
	$("#scoreTable tbody").html(tableBody);
}

	function resultCallBack(jsonData)
{
	console.log('inside resultCallBack11');
	console.log(jsonData);
	
	console.log($('#resultTable'));
	
	var tableBody = "";
	$.each(jsonData, function(i, item) {
		console.log(i);
		console.log(item);
		//row = "<tr> <td>" + item.teamId + "</td><td>" + item.teamName + "</td></tr>";
		console.log(item.resultScheduleId);
		console.log(item.resultWinnerTeamId);
		console.log(item.resultLoserTeamId);
		console.log(item.resultScoreId);
		console.log(item.resultComments);
		row = "<tr> <td>" + item.resultScheduleId + "</td><td>" + item.resultWinnerTeamId + "</td><td>" + item.resultLoserTeamId + "</td><td>" + item.resultScoreId + "</td><td>" + item.resultComments + "</td></tr>";

		tableBody = tableBody + row;        
    });
	
	console.log(tableBody);
	$("#resultTable tbody").html(tableBody);
}

function playerCallBack(jsonData)
{
	console.log('inside playerCallBack11');
	console.log(jsonData);
	
	console.log($('#playerTable'));
	
	var tableBody = "";
	$.each(jsonData, function(i, item) {
		console.log(i);
		console.log(item);
		//row = "<tr> <td>" + item.teamId + "</td><td>" + item.teamName + "</td></tr>";
		console.log(item.playerFirstName);
		console.log(item.playerLastName);
		console.log(item.playerEmail);
		console.log(item.playerPhnbr);
		console.log(item.playerTeamId);
		console.log(item.playerRoleId);
		console.log(item.playerComments);
		row = "<tr> <td>" + item.playerFirstName + "</td><td>" + item.playerLastName + "</td><td>" + item.playerEmail + "</td><td>" + item.playerPhnbr + "</td><td>" + item.playerTeamId + "</td><td>" + item.playerRoleId + "</td><td>" + item.playerComments + "</td></tr>";

		tableBody = tableBody + row;        
    });

	console.log(tableBody);
	$("#playerTable tbody").html(tableBody);
}

// function teamEntryCallBack(jsonData)
// {
// // 	console.log('inside teamEntryCallBack11');
// // 	console.log(jsonData);
	
// // 	console.log($('#teamEntryTable'));
// // 	console.log(tnametxt);
	
// // 	var tableBody = "";
// // 	$.each(jsonData, function(i, item) {
// // 		console.log(i);
// // 		console.log(item);
// // 		row = "<tr> <td>" + item.id + "</td><td>" + item.content + "</td></tr>";

// // 		tableBody = tableBody + row;        
//     });

	
// 	console.log(tableBody);
// 	$("#homeTable tbody").html(tableBody);
// }

</script>

<style>
table {
    font-family: arial, sans-serif;	
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid black;
    text-align: left;
    padding: 8px;
}

th{
    background-color: #32CD32;
    font-weight: bold;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>

<style>
#ts_tabmenu {
    font-size: .75em;
    padding: 20px 0px 0px 20px;
    color: #90EE90;
    font-weight:bold;
    background-color: #90EE90;
}
#	 ul
{
    line-height: 1em;
    margin: 0px;
    list-style-type: none;
    float: left;
    background-color: #90EE90;
    padding: 0px 0px 0px 5px;
}
#ts_tabmenu ul li
{
    float: left;
    background-color: #90EE90;
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
    color: #90EE90;
    font-weight:bold;
    background-color: #90EE90;
}
#ts_tabmenu ul li a strong
{
    font-weight: normal; /* remove the bold effect */
    display: block;
    background: url(tabs.gif) no-repeat right top;
    padding: 6px 10px 7px 5px;
    background-color: #90EE90;
    cursor: pointer;
}
#ts_tabmenu ul li a:hover
{
    position: relative;
    z-index: 5;
    background: url(tabs.gif) no-repeat left bottom;
    color: #000000;
    background-color: #90EE90;
}
#ts_tabmenu ul li a:hover strong
{
    background-image: url(tabs.gif) no-repeat;
    position: relative;
    z-index: 5;
    background-position: right bottom;
    background-color: #90EE90;
}
</style>

<style>
.cssheader {
	font: bold;
    background-color: #32CD32;
    text-align: center;
    padding: 15px;
    } 
.cssfooter {
	font: bold;
    background-color: #90EE90;
    text-align: center;
    padding: -10px;
    } 
.csssideheader {
	font: bold;
    background-color: #98FB98	;
    text-align: center;
    padding: 15px;
    } 

.sidecolumn {
/* border: 5px solid #90EE90; */
    float: left;
    width: 22%;
    padding: 10px;
    height: 1000px; /* Should be removed. Only for demonstration */
        min-width: 300px; /* 100px x3 = 300 */
    overflow:scroll;
    
}

.maincolumn {
    float: left;
    width: 56%;
    padding: 10px;
    height: 1000px; /* Should be removed. Only for demonstration */
    min-width: 300px; /* 100px x3 = 300 */
    overflow:scroll;
    color: #98FB98;
    
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}
</style>