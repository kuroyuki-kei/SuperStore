package com.superstore.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.superstore.bean.AccountBean;
import com.superstore.bean.UserBean;
import com.superstore.jdbc.DatabaseFactory;


public class UserDAO implements GenericDAO{
	
	private ArrayList<UserBean> retrievedRecord = new ArrayList<UserBean>();
	//private static String SQL_FIND_BY_TIMEDIFF = null;
	//private static String SQL_FIND_BY_CONTROL = null;
	
	//static RegisterDAO cpwReminderDAOInstance = new RegisterDAO();

	/* (non-Javadoc)
	 * @see com.superstore.servlets.GenericDAO#createRecord(java.lang.Object)
	 */
	@SuppressWarnings("null")
	@Override
	public void createRecord(Object Record) {
		// TODO Auto-generated method stub
		java.sql.Connection con= DatabaseFactory.getInstance().getConnection();
		System.out.println("sa dao na!");
		//System.out.println(${login});
		
		
	
		
		UserBean userBean = (UserBean) Record;
		
		String userName = userBean.getUserEmail();
		String birthDate = userBean.getBirthDate();		
		String firstName = userBean.getFirstName();
		String middleName = userBean.getMiddleName();
		String lastName = userBean.getLastName();
		String address = userBean.getAddress();
		String password = userBean.getPassword();
		String contact = userBean.getContact();
		
		
		String USER_INSERT = "INSERT INTO user VALUES ('0' ,'"+ firstName +"', '"+ middleName +"', '"+ lastName +"', '"+ address +"', '"+ contact +"'" +
				", '"+ birthDate +"', '"+ userName +"', AES_ENCRYPT('"+ password +"', 'key'))";
		
		System.out.println(USER_INSERT);
		Statement preparedStatement = null;
		try {
			preparedStatement = con.createStatement();
			
			preparedStatement.executeUpdate(USER_INSERT);
			
			System.out.println("query success!");
		} catch (SQLException e) {
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
		
		
		
		//System.out.println(tb.getMiddleName());
		
	}

	/* (non-Javadoc)
	 * @see com.superstore.servlets.GenericDAO#retrieveRecord(java.lang.Object)
	 */
	@Override
	public List<?> retrieveRecord(Object Record) {
		// TODO Auto-generated method stub
		
		
		AccountBean accountBean = (AccountBean) Record;
		
		String userEmail = accountBean.getUserName();
		String password = accountBean.getPassword();
		
		
		java.sql.Connection con= DatabaseFactory.getInstance().getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		String USER_RETRIEVE = "SELECT *  from user where username ='" + userEmail+"' and AES_DECRYPT(password, 'key')='" + password +"'";
		System.out.println(USER_RETRIEVE);
		
		
	try{
		preparedStatement = con.prepareStatement(USER_RETRIEVE);
		resultSet = preparedStatement.executeQuery();
		
		
		
		
		while(resultSet.next())
		{
		
			UserBean user = new UserBean();
			
			user.setFirstName((resultSet.getString("firstname")));
			user.setMiddleName((resultSet.getString("middlename")));
			user.setLastName((resultSet.getString("lastname")));
			user.setAddress((resultSet.getString("address")));
			user.setBirthDate((resultSet.getString("birthdate")));
			user.setContact((resultSet.getString("contact")));
			user.setUserEmail((resultSet.getString("username")));
			user.setPassword((resultSet.getString("password")));
			
			
			System.out.println("match found");
			retrievedRecord.add(user);
			

			
		
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
	
		
		return retrievedRecord;
	}

	/* (non-Javadoc)
	 * @see com.superstore.servlets.GenericDAO#updateRecord(java.lang.Object)
	 */
	@Override
	public void updateRecord(Object Record) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.superstore.servlets.GenericDAO#deleteRecord(java.lang.Object)
	 */
	@Override
	public void deleteRecord(Object Record) {
		// TODO Auto-generated method stub
		
	}
	

	
	}

	


	

