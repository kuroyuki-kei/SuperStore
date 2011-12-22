package com.superstore.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.superstore.bean.ProductBean;

public class ProductListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet");
		List<ProductBean> products = new ArrayList<ProductBean>();
		
		//Testing
		ProductBean bean = new ProductBean();
		bean.setProductName("Red Velvet Cupcake");
		bean.setProductDescription("topped with cream cheese frosting");
		bean.setProductId("1");
		bean.setProductQty(10);
		
		products.add(bean);
		
		bean = new ProductBean();
		bean.setProductName("Chocolate Chip Cookie");
		bean.setProductDescription("made of belgian chocolates");
		bean.setProductId("2");
		bean.setProductQty(10);
		products.add(bean);
		
		HttpSession session = req.getSession();

		session.setAttribute("products", products);

		RequestDispatcher dispatcher = req
				.getRequestDispatcher("/productList.jsp");

		dispatcher.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPost");

	}
}
