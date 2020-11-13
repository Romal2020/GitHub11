package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AdvancedDataStoring {
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:mysql ://hostname:port/db name
	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
@Test 
public void advancedStuff() throws SQLException {
	Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	Statement st = conn.createStatement();
	ResultSet rs = st.executeQuery("Select id, name, country_code from ohrm_location");
	List<Map<String, String>>listData = new ArrayList<>();
	Map<String, String>mapData;
	while(rs.next()) {
		mapData = new LinkedHashMap<>();
		mapData.put("id", rs.getObject("id").toString());
		mapData.put("name", rs.getObject("namae").toString());
		mapData.put("country_code", rs.getObject("country_code").toString());
		listData.add(mapData);
	}
	System.out.println(listData);
}
}
