<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en">
<head>
    <title>Bootstrap Theme Company Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
  <style>
  body {
      font: 400 15px Lato, sans-serif;
      line-height: 1.8;
      color: #818181;
  }
  h2 {
      font-size: 24px;
      text-transform: uppercase;
      color: #303030;
      font-weight: 600;
      margin-bottom: 30px;
  }
  
  .btn-danger
  {
   background-color: #1280ce ;
    border-color: #1280ce;
  }
  
  .btn-danger:hover
  {
 /*  #1280ce */
     background-color: #0072c6;
     border-color: #0072c6;
  }
   .jumbotron {
      /* background-color: #f4511e; */
        background-color: #a7d1ef ;
      color: #fff;
      padding: 100px 25px;
      font-family: Times;
  }
  
  .aboutmsg{
  font-family: Times;
    }
  
  .contact{
   font-family: Times;
    background-color: #a7d1ef ;
  }
  
   .navbar {
      margin-bottom: 0;
    /*   background-color: #f4511e; */
     background-color: 	#0072c6;
      z-index: 9999;
      border: 0;
      font-size: 12px !important;
      line-height: 1.42857143 !important;
      letter-spacing: 4px;
      border-radius: 0;
      font-family:Times;
      /* font-family: Montserrat, sans-serif; */
  }
  .navbar li a, .navbar .navbar-brand {
      color: #fff !important;
  }
  .navbar-nav li a:hover, .navbar-nav li.active a {
      color: #f4511e !important;
      background-color: #fff !important;
  }
  .navbar-default .navbar-toggle {
      border-color: transparent;
      color: #fff !important;
  }
  </style>
  
</head>


<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#myPage">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#about">ABOUT</a></li>
        <li><a href="#services">VIEW ALL</a></li>
         <li><a href="#contact">CONTACT</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="jumbotron text-center">
  <h1>Application Management</h1> 
  <p>Know the apps</p> 
  <form action="search" method="post">
  <center>
    <div class="input-group col-sm-4">
      <input type="text" class="form-control" size="20" placeholder="Application ID" required>
      
      <div class=" input-group-btn">
        <button type="button"  class="btn btn-danger">
          <span class="glyphicon glyphicon-search"></span>
        Search</button>
         </div>
    </div>
    </center>
  </form>
</div>



<div id="about" class="container-fluid">
  <div class="row">
    <div class="col-sm-8">
    <div class="aboutmsg">
      <h2>About Tool</h2><br>
      <h4>Basically it provides relationships between applications. The details of upstream and downstream applications are obatined. </h4><br>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
      </div>
    </div>
    </div>
</div>

<br></br><br></br><br></br>

<div id="contact" class="contact">
<div  class="container-fluid">
  <h2 class="text-left" style="color:white">CONTACT</h2>
  <div class="row">
    <div class="col-sm-5">
    <!--   <p>Contact us and we'll get back to you within 24 hours.</p> -->
      </div>
      </div>
      </div>
</div>
</body>

















































<!-- 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Management</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="jquery.monthpicker.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.0.6/handlebars.js">
	
</script>
<script type="text/javascript">
	//	To edit the associate Details for the super user
	
		
	$(document)
			.ready(
					function() {
										
						getAllApps();
						
					});
	
	function getAllApps(){
				$.ajax({
			cache: false,
			method : "POST",
			url : "rest/members/getAllApplicationDetails",
			dataType: "json",
				success : function(response) {
					console.log(response);
					//var mydata = JSON.parse(esponse.data);
				//	alert(mydata);
				
			}
		});
		
	};
	
	
	
</script>


</head>
<body>

	<table id="Table1" border="0" cellspacing="0" cellpadding="0"
		runat="Server" style="width: 100%">


		<tr align="left">
					<td
				style="margin-top: -5px; width: 1365px; color: white; font-weight: lighter; font-family: Colonna MT; font-size: 44pt; margin-left: 60px; background-image: url(images/inner_top.jpg)";>User
				Management</td>
		</tr>
	</table>

<form action="rest/members/getAllApplicationDetails" method=post>

<button type="submit" value="Submit">Submit</button>


</form>


	<form action="rest/members" method=post>
		<div
			style="height: 15px; width: 500; margin-top: 55px; padding: 50px 300px 40px 490px; font-weight: bold; font-size: 23px; font-family: Colonna MT"></div>

				<div
			style="height: 15px; margin-top: -45px; width: 20; padding: 80px 200px 10px 500px; size: 50px">
			<label style="font-family: Colonna MT; font-size: 19px;">Enter
				User ID</label> <input type=text id="usernumber" name=usernumber
				style="font-size: 11px; font-weight: bold">
		</div>


		<div style="color: white; padding: 50px 200px 40px 620px">
			<button class="btn btn-primary"
				style="background-color: rgba(119, 187, 130, 1);">
				<span title="edit" class="glyphicon glyphicon-pencil"
					style="color: white; background-color: rgba(119, 187, 130, 1);"></span>
			</button>
		</div>
		
			</form>


	<div
		style="height: 80px; border-top: 1px solid #e5e5e5; padding: -20px; clear: both; bottom: 0; position: absolute; width: 100%;">
		<div class="nine_font"
			style="padding: 30px 20px 30px 20px; text-align: center; background-image: url(images/footer.jpg); color: white">
			© 2017 Cognizant Technology Solutions.<br /> All rights reserved.
		</div>
	</div>
</body>
</html>
 -->