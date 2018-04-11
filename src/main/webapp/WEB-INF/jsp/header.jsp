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
	            }
	            
	            if(active==1){
		            	console.log('Team Tab is selected');
		            	callAjax("/teams");
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
  	  },
  	  error: console.log('error'),
  	  dataType: "json"
  	});	


    return;
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

function teamCallBack(jsonData)
{
	console.log('inside teamCallBack11');
	console.log(jsonData);
	
	console.log($('#teamTable'));
	
	var tableBody = "";
	$.each(jsonData, function(i, item) {
		console.log(i);
		console.log(item);
		row = "<tr> <td>" + item.teamId + "</td><td>" + item.teamName + "</td></tr>";

		tableBody = tableBody + row;        
    });

	
	console.log(tableBody);
	$("#teamTable tbody").html(tableBody);
}
</script>

<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>

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