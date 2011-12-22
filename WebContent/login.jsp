<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div id="leftnav">
	<div class="messagebox">
		<p class="messageboxheading">User Login</p>
		<p>${requestScope["login"]}</p>
		<form method="post" action="Account">
			<p id="testId">
				Username: <input type="text" name="userEmail" size="15" id="myForm" onchange="loadXMLDoc(this.value)">
				<p id="testText" value="sadasd"></p>
			</p>
			<p id="testId">
				Password: <input type="password" name="userPassword" size="15">
			</p>
			<input type= "hidden" name="servletForm" value="login">
			<input type="submit" name="login" value="Login">
		</form>
		
		<form name="myForm">
					
					Server Time:<input type="text" name="time" />
			<br />
<input type="text" onChange="ajaxFunction(this.value)" value="Click to display Server Time on Textbox"/>
<br />

</form>
		
	</div>
</div>