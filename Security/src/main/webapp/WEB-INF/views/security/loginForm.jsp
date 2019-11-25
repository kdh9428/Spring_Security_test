<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/security/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>LoginForm.jsp</h1>
<c:url value="j_spring_security_check" var="loginUrl"/>
	
<form action="${loginUrl }" method="post">
	<c:if test="${param.ng!=null }">
		<p>
			Login NG!<bR>
			<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != NULL }">
				message : <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message }"></c:out>
			</c:if>
		</p>
		
	</c:if>
	ID : <input type="text" name="j_username"><br>
	PW : <input type="text" name="j_password"><br>
	<input type="submit" value="LOGIN">
</form>

</body>
</html>