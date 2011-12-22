/*
** Copyright 2011 Express Scripts, Inc. * This software and documentation contains 
** confidential and proprietary information that is owned by Express Scripts, Inc.
** Unauthorized use and distribution are strictly prohibited.
**/
package com.superstore.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.superstore.bean.UserBean;
import com.superstore.jdbc.DatabaseFactory;

/**
 * @author Kevin Magsaysay
 *
 */
public class UsernameQuery extends HttpServlet{
	
	public void init(ServletConfig config) throws ServletException {	
		super.init(config);
	}
 
	public void destroy() {
 
	}
 
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String dataReturn = request.getParameter("value");
		System.out.println(dataReturn);
		
		
		//Date df = new Date();
		//out.println(df.getTime());
		java.sql.Connection con= DatabaseFactory.getInstance().getConnection();
		
		 boolean validEmail = isValidEmailAddress(dataReturn);
		 
		 System.out.println(validEmail);

		 	
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		String USER_RETRIEVE = "SELECT *  from user where username ='" + dataReturn +"'";
		System.out.println(USER_RETRIEVE);
		
		String resultString = null;
	try{
		preparedStatement = con.prepareStatement(USER_RETRIEVE);
		resultSet = preparedStatement.executeQuery();
		
		
		
		
		while(resultSet.next())
		{
		

			resultString = resultSet.getString("username");
			
			
			
			System.out.println("match found");
		
			

			
		
		}
		
		resultSet.close();
	}
 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
		

		System.out.println("once");
	
		if(validEmail==false || dataReturn.equals("invalid format"))
		{
			out.println("format is invalid");
		}
		else if(resultString==null)
		{
		out.println("user is available");
		}
		
		else
		{
		out.println("user is not available");
		}
		
		
	}
 
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		doPost(request,response);
	}

	
	public boolean isValidEmailAddress(String emailAddress) {
		String expression = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+(?:[A-Z]{2}|nl|be|de|com|org|net|gov|mil|biz|info|mobi|name|aero|jobs|museum)$";
		CharSequence inputStr = emailAddress;
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();

	}

}
