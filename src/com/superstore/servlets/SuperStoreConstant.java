package com.superstore.servlets;

public class SuperStoreConstant {


	    // Filename Constants
	    public final static String DB_CONFIG_FILE = "DatabaseConfigurationFile.properties";
	    public final static String REMINDER_CONFIG_FILE = "ReminderConfigurationFile.properties";
	    public final static String SMTP_CONFIG_FILE = "SMTPConfigurationFile.properties";
	    public final static String LOG4J_XML = "Log4J.xml";

	    // Time Constants in milliseconds
	    public final static long SECOND = 1000;
	    public final static long MINUTE = SECOND * 60;
	    public final static long HOUR = MINUTE * 60;
	    public final static long DAY = HOUR * 24;

	    // Timer constants for the Timer object referencing to
	    // ReminderConfigurationFile.properties
	    public final static String TIMER_DELAY = "timer_delay";
	    public final static String TIMER_PERIOD = "timer_period";

	    // SMTP Configuration Constants referencing to
	    // ReminderConfigurationFile.properties
	    public final static String SMTP_HOST_NAME = "127.0.0.1";
	    public final static String SMTP_PORT = "25";
	    public final static String SMTP_SOCKECTFACTORY_PORT = "mail.smtp.socketFactory.port";
	    public final static String SMTP_USER = "kbmag@kbmagsaysay.com";
	    public final static String SMTP_PASSWORD = "kbmag";
	    public final static String SMTP_SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	    public final static String SMTP_AUTH = "mail.smtp.auth";
	    public final static String SMTP_DEBUG = "mail.debug";
	    public final static String SMTP_FALLBACK = "mail.smtp.socketFactory.fallback";

	    // Request Status Constants referencing to
	    // ReminderConfigurationFile.properties
	    public final static String STATUS_NAME1 = "status_name1";
	    public final static String STATUS_NAME2 = "status_name2";
	    public final static String STATUS_NAME3 = "status_name3";
	    public final static String STATUS_NAME4 = "status_name4";
	    public final static String STATUS_NAME5 = "status_name5";
	    public final static String STATUS_NAME6 = "status_name6";

	    // Email content Constants depending on request status referencing
	    // to ReminderConfigurationFile.properties
	    public final static String STATUS_NAME1_TEXT = "status_name1_text";
	    public final static String STATUS_NAME2_TEXT = "status_name2_text";
	    public final static String STATUS_NAME3_TEXT = "status_name3_text";
	    public final static String STATUS_NAME4_TEXT = "status_name4_text";
	    public final static String STATUS_NAME5_TEXT = "status_name5_text";

	    public final static String STATUS_NAME1_SUBJECT = "status_name1_subject";
	    public final static String STATUS_NAME2_SUBJECT = "status_name2_subject";
	    public final static String STATUS_NAME3_SUBJECT = "status_name3_subject";
	    public final static String STATUS_NAME4_SUBJECT = "status_name4_subject";
	    public final static String STATUS_NAME5_SUBJECT = "status_name5_subject";

	    // Subject Content Constants depending on request status referencing to
	    // ReminderConfigurationFile.properties
	    public final static String REMINDER_STARTIME = "reminder_starttime";
	    public final static String REMINDER_TIMEGAP = "reminder_timegap";
	    public final static String SUPPORTPEROPLE_EMAIL = "SUPPORT_EMAIL";
	    public final static String CBO_EMAIL = "kbmag@kbmagsaysay.com"; //"kbmagsaysay@gmail.com";

	    // Default email body constants referencing status referencing
	    // to ReminderConfigurationFile.properties
	    public final static String EMAIL_GREETING = "email_greeting";
	    public final static String EMAIL_MESSAGE1 = "email_message1";
	    public final static String EMAIL_CPWLINK_TOOL = "email_cpwlink_tool";
	    public final static String EMAIL_CLOSING = "email_closing";
	    public final static String CONTENT_TYPE = "text/plain";
	    public final static String DOUBLESPACE = "\n\n";

	    // Database configuration contants referencing to
	    // DatabaseConfigurationFile.properties
	    public final static String DBNAME = "dbName";
	    public final static String DBSCHEMA = "dbSchema";
	    public final static String DBURL = "dbURL";
	    public final static String DBUSER = "dbUser";
	    public final static String DBPASSWORD = "dbPassword";
	    public final static String JDBCDRIVER = "jdbcDriver";

	    // PartRequestBean Columns Constants
	    public final static String CONTROLNUMBER = "CONTROLNUMBER";
	    public final static String USER_ID = "USER_ID";
	    public final static String FOCALPOINTCONTACT = "FOCALPOINTCONTACT";
	    public final static String BACKUPCONTACT = "BACKUPCONTACT";
	    public final static String MGTREQUESTING = "MGTREQUESTING";
	    public final static String REQUESTSTATUS = "REQUESTSTATUS";
	    public final static String LAST_UPDATE_TS = "LAST_UPDATE_TS";

	    // SQL Constant referencing to the sql queries from
	    // DatabseConfiguration.properties
	    public final static String CPW_SELECT_PENDEDREQUEST = "select.cpw.part_request.pendedrequest";
	    public final static String CPW_SELECT_SUPPLIERLIST = "select.cpw.userinfo.supplierlist";
	    
	    public final static String ENCRYPT_KEY = "key";

	}



