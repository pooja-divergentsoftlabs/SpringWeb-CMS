<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Labtest</title>

<script src="/springweb-jpa-sample//resources/js/bootstrap.min.js"></script>
<link href="/springweb-jpa-sample//resources/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>


	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-6">
						<form class="form-horizontal" action="lab"
							method="POST">
							<fieldset>

								<!-- Form Name -->
								<legend>Labtest Add</legend>
								
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
									<label class="col-md-4 control-label" for="quantity">PatientName</label>
									<div class="col-md-4">
										<input id="quantity" name="patientname" type="text" placeholder=""
											class="form-control input-md">

									</div>
								</div>


								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" class="btn btn-info"
											value="Add Labtest">
									</div>
								</div>

							</fieldset>
						</form>
					</div>
					<div class="col-md-6"></div>
				</div>

				<div class="row">
					<div class="col-md-6">
					<legend>Labtest List</legend>
						<div class="table-responsive">
							<table id="example" class="table table-striped table-bordered">							
							<thead>
								<tr>
									<th>Id</th>
									<th>Name</th>
									<th>PatientName</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${allLabtests}" var="labtest">
									<tr>
										<td><c:out value="${labtest.id}" /></td>
										<td><c:out value="${labtest.name}" /></td>
										<td><c:out value="${labtest.patientname}" /></td>
										<td><a href="lab/remove?labtestId=${labtest.id}"
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