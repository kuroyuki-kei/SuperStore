<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="/c.tld"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div id="content">
	<form action="" method="post">
		List of Products
		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
				</tr>
			</thead>
			<c:forEach items="${products}" var="product">
				<tr>
					<td><a
						href="ProductListServlet?productId=${product.productId}"> <c:out
								value="${product.productName}" />
					</a></td>
					<td><c:out value="${product.productDescription}" /></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</div>