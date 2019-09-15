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
					<li><a href="/login">Login</a></li>
					<li><a href="/registerproduct">Add New Product</a></li>
					<li><a href="/cat_product">All Products</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	
	
	<c:choose> 
	<c:when test="${mode=='MODE_PRODUCT_HOME'}">
	<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h1>Welcome to Creative Shopping</h1>
					<h3>Best Shopping site in Bengalore</h3>
				</div>
			</div>
 </c:when>
			
			<c:when test="${mode=='MODE_REGISTER_PRODUCT'}">
		    <div class="container text-center">
			<h3>New Product Details</h3>
			<hr>
			<form class="form-horizontal" method="POST" action="save-product">
			<input type="hidden" name="id" value="${product.id }" />
					
					
					<div class="form-group">
						<label class="control-label col-md-3">Product Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="productname"
								value="${product.productname }" />
						</div>
					</div>		
	
					<div class="form-group">
						<label class="control-label col-md-3">Product Price </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="price"
								value="${product.price }" />
						</div>
					</div>
					
								
					
					
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Add" />
					</div>
				</form>
			</div>
			 </c:when>
			 
			 
			 
			 
			 <c:when test="${mode=='ALL_PRODUCTS'}">
			<div class="container text-center" id="tasksDiv">
				<h3>All Users</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>PRODUCT NAME</th>
								<th>PRICE</th>
								<th>Delete</th>
								<th>Edit</th>
								<th>Add to Cart</th>
							</tr>
						</thead>
						
						<tbody>
						<c:forEach var="product" items="${products }">
								<tr>
									<td>${product.id}</td>
									<td>${product.productname}</td>
									<td>${product.price}</td>
									<td><a href="/delete-product?id=${product.id }"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a href="/edit-product?id=${product.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="/cat_product"><span
											class="glyphicon glyphicon-plus"></span></a></td>							
								</tr>
								</c:forEach>
						
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		
		<c:when test="${mode=='MODE_UPDATE_PRODUCT'}">
		    <div class="container text-center">
			<h3>Update Product Details</h3>
			<hr>
			<form class="form-horizontal" method="POST" action="save-product">
			<input type="hidden" name="id" value="${product.id}"/>
			
			
					
					
					<div class="form-group">
						<label class="control-label col-md-3">Product Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="productname"
								value="${product.productname }" />
						</div>
					</div>		
	
					<div class="form-group">
						<label class="control-label col-md-3">Product Price </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="price"
								value="${product.price }" />
						</div>
					</div>
					
								
					
					
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Update" />
					</div>
				</form>
			</div>
			 </c:when>
			 
		
		
		
		
		
			</c:choose>
			
	
<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>