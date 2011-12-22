<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div id="container">
	<div id="banner">&nbsp;</div>
	<div id="topmenu">
		<ul>
	<c:choose>
	<c:when test="${sessionScope.login == null}">
	<li><a href="home.jsp" title="Home">Home</a></li>
	</c:when>
	<c:when test="${sessionScope.login != null}">
	<li><a href="userhome.jsp" title="Home">Home</a></li>
	</c:when>
	</c:choose>
			<li><a href="#" title="View Products">View Products</a></li>
			<li><a href="#" title="Contact Us">Contact Us</a></li>
			<li><a href="Register.jsp" title="Register">Register</a></li>
		</ul>
	</div>
</div>
