<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div id="leftnav">
	<div class="messagebox">
		<p class="messageboxheading">Hi, ${sessionScope["login"]}</p>
		<br/>
		<a href="#" title="RecentPurchase">Recent Purchase</a>
		<br/>
		<a href="#" title="RecentPurchase">Recent Purchase</a>
		<br/>
		<a href="#" title="RecentPurchase">Recent Purchase</a>
		<br/>
		<form action="Account" method="post">
		<input type= "hidden" name="servletForm" value="logout">
		<input type="submit" value="logout">  
		</form>
	</div>
</div>