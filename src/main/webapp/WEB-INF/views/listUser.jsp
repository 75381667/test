<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table align='center' border='1' cellspacing='0'>
  <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
    </tr>
    <c:forEach items="${users}" var="s" varStatus="st">
        <tr>
            <td>${s.id}</td>
            <td>${s.userId}</td>
            <td>${s.userName}</td>
        </tr>
    </c:forEach>
 
</table>
 
</body>
</html>