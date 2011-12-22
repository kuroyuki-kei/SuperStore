<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="sample-div.css">
<script type="text/javascript">
var arr = new Array("0","31","30","29","28");


function change(selectYear){

if(document.forms["registerForm"].elements["selectYear"].value %4==0 && selectYear.value==4)
{
var comboValue = 3;
}
else{
var comboValue = selectYear.value;
}

document.forms["registerForm"].elements["selectDate"].options.length=0;
for (var i=1;i<=arr[comboValue];i++){
var option = document.createElement("option");
option.setAttribute('value',i+1);
option.innerHTML = i;
document.forms["registerForm"].elements["selectDate"].appendChild(option);
}
}
function populate()
{
document.forms["registerForm"].elements["selectYear"].options.length=0
for(var year=1950;year<=new Date().getFullYear();year++)
{
var option = document.createElement("option");
option.setAttribute("value",year);
option.innerHTML = year;
document.forms["registerForm"].elements["selectYear"].appendChild(option);
}
}
function populateYear()
{

change(document.forms["registerForm"].elements["selectMonth"]);

}
function populateMonth()
{
change(document.forms["registerForm"].elements["selectMonth"]);

}
</script>
</head>
<body>

	<%@ include file="banner.jsp"%>
	<%@ include file="RegisterForm.jsp"%>
	<%@ include file="footer.jsp"%>

</body>
</html>