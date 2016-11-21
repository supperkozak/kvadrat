<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kvadrat</title>
</head>
<body>
	<!-- You must use form if you want to send some data to server. Action - URL which will be created when the button in pressed -->
	<!-- Ви повинні використовувати форму, якщо необхідно передати дані на сервер. Action - URL, яка створиться при натисканні кнопки підтвердження -->

	<form action="showAllData" method="POST" accept-charset="utf-8" >
		<h1>Input a numeric value</h1>
		
		<h2>ax^2 + bx + c = 0</h2>

			<input type="text" name="a" value="">*X^2 
			 + <input type="text" name="b" value="">*X 
			 + <input type="text" name="c" value=""> =  0
			<button type="submit">Find roots</button>
	
	<c:if test="${not empty message}">

		<h1>${message}</h1>
	</c:if>
	<c:if test="${not empty allData}">
	
	<table>
		<thead>
			<tr>
				<th>A</th>
				<th>  </th>
				<th>B</th>
				<th>  </th>
				<th>C</th>
				<th>  </th>
				<th>X1</th>
				<th>  </th>
				<th>X2</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${allData}" var="data">
				<tr>
					<td>${data.a}</td>
					<td>   </td>
					<td>${data.b}</td>
					<td>   </td>
					<td>${data.c}</td>
					<td>   </td>
					<td>${data.x1}</td>
					<td>   </td>
					<td>${data.x2}</td>
				</tr>
				</c:forEach>
		</tbody>
	</table>
	</c:if>
	</form>
</body>
</html>