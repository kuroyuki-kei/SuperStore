/*
** Copyright 2011 Express Scripts, Inc. * This software and documentation contains 
** confidential and proprietary information that is owned by Express Scripts, Inc.
** Unauthorized use and distribution are strictly prohibited.
**/
package com.superstore.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.superstore.bean.AccountBean;
import com.superstore.bean.UserBean;
import com.superstore.service.UserServices;

/**
 * @author Kevin Magsaysay
 *
 */
public class AccountServlet extends HttpServlet{

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		response.setContentType("text/html");
		HttpSession session = request.getSession();
//		PrintWriter out = response.getWriter();

		String formName = "name";
		formName = request.getParameter("servletForm");
		
		System.out.println(formName);
		
		
		if(formName.equals("login"))
		{

			System.out.println("amp pumasok ba?");
		String userName = request.getParameter("userEmail");
		String password = request.getParameter("userPassword");
//		out.println("Username:");
//		out.print(userEmail);
		
//		out.println("middleName:");
//		out.print(middleName);
//		out.println("middleName:");
//		out.print(middleName);
//		
//	

		AccountBean Account = new AccountBean();
		Account.setUserName(userName);
		Account.setPassword(password);
		
		ArrayList<UserBean> databaseRecords = UserServices.getUser(Account);
		
		Iterator iterator = databaseRecords.iterator();
		
		UserBean user = null;
		while(iterator.hasNext())
		{
			 user = (UserBean) iterator.next();
			 //System.out.println("may kasunod");
			
		}
		
		if(user!= null)
		{
		session.setAttribute("login", user.getFirstName());
		
//		RequestDispatcher dispatcher = request
//				.getRequestDispatcher("/userhome.jsp");
//
//		dispatcher.forward(request, response);
		response.sendRedirect("userhome.jsp");
		
		}
		else
		{
			request.setAttribute("login", "Error!");	
			
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("/home.jsp");

			dispatcher.forward(request, response);
			
		}

		}
//		if(request.getParameter("registerForm").isEmpty())
//		{
//			System.out.println("pota!");
//		}
//		
		if(formName.equals("register"))
		{
		session.setAttribute("login", "true");	
		String firstName = request.getParameter("firstName");
		String middleName = request.getParameter("middleName");
		String lastName = request.getParameter("middleName");
		String birthDate = request.getParameter("birthDate");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String userEmail = request.getParameter("userEmail");
		String password = request.getParameter("userPassword");
//		out.println("Username:");
//		out.print(userEmail);
		
//		out.println("middleName:");
//		out.print(middleName);
//		out.println("middleName:");
//		out.print(middleName);
//		
//		
		UserBean user = new UserBean();
		user.setFirstName(firstName);
		user.setMiddleName(middleName);
		user.setLastName(lastName);
		user.setBirthDate(birthDate);
		user.setContact(contact);
		user.setAddress(address);
		user.setUserEmail(userEmail);
		user.setPassword(password);
		
		
		UserServices.addUser(user);
		
		//session.invalidate();
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/Register.jsp");

		dispatcher.forward(request, response);
		}
		
		
		if(formName.equals("logout"))
		{
			session.invalidate();
			response.sendRedirect("home.jsp");
			
		}
		
		System.out.println("ssa saervlet");

		
		
//		out.println("test context attributes set by listener"); 
//		String x = request.getParameter("name");
//		out.println(x);
//		out.println("Beer Selection Advice<br>");
//		String c = request.getParameter("color");
//		out.println("<br>Got beer color " + c);
//		out.println("<a href='" + response.encodeURL("unangServlet") +"'>aaaaa</a>");
//		out.println("SessionID: " + session.getId());
//session.invalidate();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		
	}


}
