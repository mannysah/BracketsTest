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
	    $( "#tabs" ).tabs({
 	    	activate: function (event, ui) {
	            var active = $('#tabs').tabs('option', 'active');
	            $("#tabid").html('the tab id is ' + $("#tabs ul>li a").eq(active).attr("href"));
	            console.info('YYYYY');
	            console.info(active);
	            
	            var jsonObject = 
	            	{
	            	"id": "1",
	            	"value": "2"
	            	};
	            $.ajax({
	            	  type: "POST",
	            	  url: "/home",
	            	  data: "test",
	            	  success: alert('hel'),
	            	  dataType: "json"
	            	});
 	    	}
	    });	  
  });
		   
  </script>

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