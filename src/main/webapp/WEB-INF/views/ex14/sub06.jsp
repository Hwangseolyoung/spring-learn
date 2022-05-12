<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css" integrity="sha512-GQGU0fMMi238uA+a/bdWJfpUGKUkBdgfFdgBm72SUQ6BeyWjoY/ton0tEjH+OSH9iP4Dfh+7HM0I9f5eR0L/4w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" referrerpolicy="no-referrer"></script>
<title>Insert title here</title>
</head>
<body>
	
	<%-- ${pageContext.request.contextPath } 생략해도 추가해줌--%>
	<c:url value="/ex14/sub06" var="employeeUrl"></c:url>
	
	<h1>NEW 직원 등록카드</h1>
	${message }
	
	<form action="${employeeUrl }/ex14/sub06" method="post">
		LastName : <input type="text" name="lastName" value="Jimin" /> <br/>
		firstName : <input type="text" name="firstName" value="Kim" /> <br/>
		Birth Date : <input type="date" name="birthDate" value="1966-09-09" /> <br/>
		Photo : <input type="file" name="photo" value="" /> <br/> <br/>
		Notes : <textarea name="notes" id="" cols="30" rows="10">Resolution..</textarea> <br/>
		<button>등록</button>
	</form>
	

</body>
</html>