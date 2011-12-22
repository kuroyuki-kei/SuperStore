/*
** Copyright 2011 Express Scripts, Inc. * This software and documentation contains 
** confidential and proprietary information that is owned by Express Scripts, Inc.
** Unauthorized use and distribution are strictly prohibited.
**/
package com.superstore.service;

import java.util.ArrayList;

import com.superstore.bean.AccountBean;
import com.superstore.bean.UserBean;
import com.superstore.dao.UserDAO;

/**
 * @author Kevin Magsaysay
 *
 */
public class UserServices {
	
	static com.mysql.jdbc.Connection conn;
	
	public static void addUser(UserBean user)
	{
		
		new UserDAO().createRecord(user);
	}
	
	
	public static ArrayList getUser(AccountBean account)
	{
		
		ArrayList users = (ArrayList) new UserDAO().retrieveRecord(account);
		
		return users;
	}
	
	
}
