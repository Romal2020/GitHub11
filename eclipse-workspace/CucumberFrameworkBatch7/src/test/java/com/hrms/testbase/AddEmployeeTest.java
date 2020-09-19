package com.hrms.testbase;


import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;





public class AddEmployeeTest extends CommonMethods {
	
	public void addEmployee(String firstName,String lastName,String userName, String password) {
		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);
		
		jsClick(dash.pimLinkBtn);
		jsClick(dash.addEmpBtn);
		
		sendText(addEmp.firstNameField, firstName);
		sendText(addEmp.lastNameField, lastName);
		click(addEmp.createLoginDetailsCheckbox);
		sendText(addEmp.userName, userName);
		sendText(addEmp.userPassword, password);
		sendText(addEmp.confirmPassword, password);
		click(addEmp.saveButton);
		
		Assert.assertEquals(persDetails.profileName.getText(), firstName+" "+lastName);
	}
	

	public static String[][] getData() {
	String [][]	data= {
			{"Alicfsd", "Silvefrsvdsfston7373","Alsty"
					+ ""
					+ ""
					+ "dfisil4x4","!K!ters1Duzf"},
			{"Asasfli", "Siasafslverston323","Alisiasal4x5","!K!ters1Duz"},
			{"Alwfdwi", "Silvefrdggston333","Alishtyifl4x6","!K!ters1Duz"},
			{"Alrftrtwi", "Silvefrstuytuon343","Atyufrulisil4x7","!K!ters1Duz"},
			{"Alfi", "Silverston35f3","Alisil4fx8","!K!tefrs1Duz"},
	};
	return data;
}
}