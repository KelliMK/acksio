<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>

	<head>

		<meta name="author" content="jhorne@ycp.edu">
		<meta name="desc" content="ACKSIO dispatch draft updated 3/6/18">

		<title>Acksio: Dispatcher Solutions</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/_view/default.css" title="default"/>
	</head>

	<body>
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
		
		<div id=header>

			<!-- testing functionality of topbar, adjust for neatness later-->
			<h2>ACKSIO</h2>
		</div>

		<div id=main_body>
			<form action="${pageContext.servletContext.contextPath}/courier" method="post">
				<input type="submit" name="edit" value="Edit Information"><br><br>
				<input type="submit" name="insertvehicle" value="Add a Vehicle"><br>
			</form>
			
			<p>Your Vehicles</p>
			<div id=vehicles>
				<c:forEach var="vehicleloop" items="${loop}">
					${vehicleloop.licensePlate}, ${vehicleloop.year}, ${vehicleloop.make}, ${vehicleloop.model}, ${vehicleloop.licensePlate}
					<c:if test="${vehicleloop.active == 1}">
						ACTIVE
					</c:if><br>
				</c:forEach>
			</div>
		</div>

		<!--
		<div id=link>

			<a href='GoogleMapsTest.html'>GoogleMaps</a>
		</div>
		-->
	</body>
</html>
