package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardcodedExamples {
	/***
	 * REST Assured - Java library specifically developed to automate REST endPoints
	 * 
	 * Given - Preparing your request When - what action will you perform, what type
	 * of call are you making? Then - Verification
	 */
	String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDQwMDM0MTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwNDA0NjYxNywidXNlcklkIjoiMTMwOCJ9.RZJbw1yNdC9BlwqRUfJw2bKs4jiUlhwk73IrX-JSKl8";
	static String employeeID;

	//@Test
	public void sampleTest() {
		/** BaseURI for all endPoints */
		// RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
		/** JWT */

		/** Preparing request for /getOneEmployee.php */
		/** Using.log.all to print out everything being sent with the request */
		RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json").queryParam("employee_id", "3695");
		/** Making call to /getOneEmployee.php */
		Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");
		/** One way to print response object */
		// System.out.println(getOneEmployeeResponse.asString());
		/** Second way using rest assured prettyPrint() */
		//getOneEmployeeResponse.prettyPrint();
		/** Using assertThat() to verify status code */
		getOneEmployeeResponse.then().assertThat().statusCode(200);

	}

	@Test
	public void aPOSTcreatEmployee() {

		/** Preparing request for creating an employee */
		RequestSpecification createEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json")
				.body("{\r\n" + "  \"emp_firstname\": \"Rohit\",\r\n" + "  \"emp_lastname\": \"Sondhi\",\r\n"
						+ "  \"emp_middle_name\": \"n/a\",\r\n" + "  \"emp_gender\": \"M\",\r\n"
						+ "  \"emp_birthday\": \"2000-10-18\",\r\n" + "  \"emp_status\": \"Employee\",\r\n"
						+ "  \"emp_job_title\": \"Cloud Architect\"\r\n" + "}");
			//	.log().all();
		/** making call to /createEmployee.php */
		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");

		/** printing response */
		//createEmployeeResponse.prettyPrint();
		/**
		 * Using jsonPath() to view the response body which lets us get the employee ID
		 * we are storing the employeeID as a static global variable to be able to use
		 * with other calls
		 */
		employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
	//	System.out.println(employeeID);
		/** Verifying status code is 201 */
		createEmployeeResponse.then().assertThat().statusCode(201);
		/**
		 * Verifying response body "Message" is paired with "Entry Created"; equalTo()
		 * method comes from static HamCrest package - NEED TO IMPORT MANUALLY import
		 * static static org.hamcrest.Matchers.*;
		 */
		createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));
		/** Verifying created employee first name */
		createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("mohammad"));
		/** Verifying server Apache/2.4.39 (Win64) PHP/7.2.18 */
		createEmployeeResponse.then().header("server", "Apache/2.4.39 (Win64) PHP/7.2.18");
	}

	@Test
	public void bGetcreatesdEmployee() {
		/** preparing request to get created employee */
		RequestSpecification getCreatedEmployeeRequest = given().header("Content-Type", "application/jason")
				.header("Authorization", token).queryParam("employee_id", employeeID);
		/** Storing response for retrieving created employee */
		Response getCreatedEmpoyeeResponse = getCreatedEmployeeRequest.when().get("/getOneEmployee.php");
		getCreatedEmpoyeeResponse.prettyPrint();
		String empID = getCreatedEmpoyeeResponse.body().jsonPath().getString("employee[0].employee_id");

		boolean verifyingEmployeeID = empID.equalsIgnoreCase(employeeID);

		Assert.assertTrue(verifyingEmployeeID);
		/** Verifying status code is 200 */
		getCreatedEmpoyeeResponse.then().assertThat().statusCode(200);
		/**
		 * Storing full response as a string so that we are able to pass is as an
		 * argument with JsonPath
		 */
		String response = getCreatedEmpoyeeResponse.asString();
		/** Created object of JsonPath */
		JsonPath js = new JsonPath(response);
		/** Grabbing employee ID using 'js' */
		String employeeId = js.getString("employee[0].employee_id");
		String firstName = js.getString("employee[0].emp_firstname");
		String middleName = js.getString("employee[0].emp_middle");
		String lastName = js.getString("employee[0].emp_lastname");
		String birthday = js.getString("employee[0].emp_birthday");
		String gender = js.getString("employee[0].emp_gender");
		String jobTitle = js.getString("employee[0].emp_job_title");
		String status = js.getString("employee[0].emp_status");
		/** Asserting response employee ID matches stored employee ID */
		Assert.assertTrue(employeeId.contentEquals(employeeID));
		/***/
		Assert.assertEquals(firstName, "Rohit");
		Assert.assertEquals(middleName, "n/a");
		Assert.assertEquals(lastName, "Sondhi");
		Assert.assertEquals(birthday, "2000-10-18");
		Assert.assertEquals(gender, "M");
		Assert.assertEquals(jobTitle, "Cloud Architect");
		Assert.assertEquals(status, "Employee");
	}

	@Test
	public void cGETallEmployees() {
		/** Preparing request to get all employees */
		RequestSpecification getAllEmployeesRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token);
		Response getAllEmployeesResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");
		/** Printing response */
		//getAllEmployeesResponse.prettyPrint();
		/** Storing response as aString */
		String response = getAllEmployeesResponse.asString();
		/**
		 * Creating object of jsonPathand passing response as a String as an argument
		 */
		JsonPath js = new JsonPath(response);
		/**
		 * Retrieving the size of the array (the number of object in the String in the
		 * Array
		 */
		int count = js.getInt("Employees.size()");
	//	System.out.println(count);
//
//		for (int i = 1; i < count; i++) {
//			String allEmployeeIDs = js.getString("Employees[" + i + "].employee_id");
//			// System.out.println(allEmployeeIDs);
//
//			if (allEmployeeIDs.contentEquals(employeeID)) {
//				//System.out.println("Employee ID: " + employeeID + " is present in the body");
//				String firstNameOfEmpID = js.getString("Employee[" + i + "].emp_firstname");
//			//	System.out.println(firstNameOfEmpID);
//				break;
//			}
//		}
//		/**for loop to print out first names of all employees*/
//		for(int i = 0;i < count; i++) {
//			String allFirstNames = js.getString("Employees[" + i +"].emp_firstname");
//			System.out.println(allFirstNames);
//		}
	}
	@Test
	public void dPUTupdateCreatedEmployee() {
		/**Task completed*/
		given().body("{\r\n"
				+ "  \"employee_id\": \"{{empID}}\",\r\n"
				+ "  \"emp_firstname\": \"Rohit\",\r\n"
				+ "  \"emp_lastname\": \"Sondhi\",\r\n"
				+ "  \"emp_middle_name\": \"n/a\",\r\n"
				+ "  \"emp_gender\": \"M\",\r\n"
				+ "  \"emp_birthday\": \"2000-10-18\",\r\n"
				+ "  \"emp_status\": \"Super Contractor\",\r\n"
				+ "  \"emp_job_title\": \"IT Analyst\"\r\n"
				+ "}");
		
		
		
	}

	
}
