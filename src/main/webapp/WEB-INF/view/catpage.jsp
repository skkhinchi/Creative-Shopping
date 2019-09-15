<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Welcome to Creative Shopping</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<body >

<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome  " class="navbar-brand">HOME</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
				<li><a href="/login">Logout</a></li>
					
					
				</ul>
			</div>
		</div>
	</div>
	
	
	<div class="container text-center" id="tasksDiv">
				<h3>All Categories</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						
						<tr>
    <th>categories</th>
    <th>Select</th> 
   
  </tr>
  <tr>
    <td>Electronics</td>
    <td > <a href="/show-products">click me</a> </td>
   
  </tr>
  <tr>
    <td>Sports</td>
     <td> <a href="/show-products">click me</a> </td>
   
  </tr>
  <tr>
    <td>Kids</td>
     <td><a href="/show-products">click me</a> </td>
   
  </tr>
  <tr>
    <td>Home and Kitchen</td>
     <td><a href="/show-products">click me</a> </td>
   
  </tr>
  <tr>
    <td>Men</td>
     <td> <a href="/show-products">click me</a> </td>
   
  </tr>
  <tr>
    <td>Women</td>
     <td><a href="/show-products">click me </a> </td>
   
  </tr>
					</table>
				</div>
			</div>
	
	
	
	
	
<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>