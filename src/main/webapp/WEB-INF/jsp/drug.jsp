<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Drug</title>

<script src="/springweb-jpa-sample//resources/js/bootstrap.min.js"></script>
<link href="/springweb-jpa-sample//resources/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>


	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-6">
						<form class="form-horizontal" action="drug"
							method="POST">
							<fieldset>

								<!-- Form Name -->
								<legend>Drug Add</legend>
								
								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="id">ID</label>
									<div class="col-md-4">
										<input id="id" name="id" type="text" placeholder=""
											class="form-control input-md">

									</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="name">Name</label>
									<div class="col-md-4">
										<input id="name" name="name" type="text" placeholder=""
											class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="quantity">Quantity</label>
									<div class="col-md-4">
										<input id="quantity" name="quantity" type="text" placeholder=""
											class="form-control input-md">

									</div>
								</div>


								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" class="btn btn-info"
											value="Add Drug">
									</div>
								</div>

							</fieldset>
						</form>
					</div>
					<div class="col-md-6"></div>
				</div>

				<div class="row">
					<div class="col-md-6">
					<legend>Drug List</legend>
						<div class="table-responsive">
							<table id="example" class="table table-striped table-bordered">							
							<thead>
								<tr>
								    <th>Id</th>
									<th>Name</th>
									<th>Quantity</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${allDrugs}" var="drug">
									<tr>
										<td><c:out value="${drug.id}" /></td>
										<td><c:out value="${drug.name}" /></td>
										<td><c:out value="${drug.quantity}" /></td>
										<td><a href="drug/remove?drugId=${drug.id}"
											class="btn btn-danger" type="button">Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						</div>
					</div>
					<div class="col-md-6"></div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>