/*
** Copyright 2011 Express Scripts, Inc. * This software and documentation contains 
** confidential and proprietary information that is owned by Express Scripts, Inc.
** Unauthorized use and distribution are strictly prohibited.
**/
package com.superstore.dao;

import java.util.List;

/**
 * @author Kevin Magsaysay
 *
 */
public interface GenericDAO {
	
	
	public void createRecord(Object Record);
	public List<?> retrieveRecord(Object Record);
	public void updateRecord(Object Record);
	public void deleteRecord(Object Record);
	

}
