Feature: Name validations against DB
@dbValidation
Scenario: First name validation against DB - searching by Employee Id 
When login with valid credentials
Then  verify the dashboard logo ia displayed
When navigate to employee list 
And enter a valid Employee id "0056266"
Then click on search Button 
And verify the lable is displayed 
When get first name from the lable
Then get first name from the db
Then validate first names from ui against db 

