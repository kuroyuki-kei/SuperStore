<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div id="content" >
	<div class="messagebox">
			<p class="messageboxheading">Register</p>
			User Info(Please Complete fields with *)
			<form method="post" name ="registerForm" action="Account">
			<table>
			<tr>
			<td>
				<p id = "testId">First Name:  <input type="text" name="firstName" size="15" ></p>
			</td>
			<td>
				<p id = "testId">Middle Name:  <input type="text" name="middleName" size="15" ></p>
			</td>
			<td>
				<p id = "testId">Last Name:  <input type="text" name="lastName" size="15" ></p>
			</td>
			</tr>
			<tr>
			<td>
				<p id = "testId">Birthdate:  <select name="year" onClick="populate();" id="year"></p>
			</td>
			</tr>
			<tr>
			<td>
				<p id = "testId">Contact:  <input type="text" name="contact" size="15" ></p>
			</td>
			</tr>
			<tr>
			<td>
				<p id = "testId">Address:  <input type="text" name="address" size="15" ></p>
			</td>
			</tr>
			</table>
			<br>
			Login Details
			<table>
			<tr>
			<td>
				<p id = "testId">Email/Username:  <input type="text" name="userEmail" size="15" ></p>
			</td>
			<td>
				<p id = "testId">Password:  <input type="password" name="userPassword" size="15" ></p>
			</td>
			</tr>
			<tr>
			<td>
				<p id = "testId"><input type="hidden" name="servletForm" value="register"></p>
			</td>
			</tr>
			</table>
						<p align="center"><input type="submit" value="Register"></p>  
			</form>
		</div>
	</div>