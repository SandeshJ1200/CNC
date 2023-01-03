Feature: This Feature contains test case of Invoiced orders




Scenario: Manager should be able to See the list Invoiced order in the form of table

 #Given User logs into the application as manager
 #When manager selects picking tab
 #Then manager selects Invoiced orders option
 #Then manager should see customer Invoiced Details


Scenario: Manager should be able to search the Invoiced with details such as
          Name,OrderID,Invoiced Date,Status,RouteNumber

 #Given User logs into the application as manager
 #When manager selects picking tab
 #Then manager selects Invoiced orders option
 #Then manager clicks on Search Text Box
 #Then manager should be able to search customer with Name,OrderID,Invoiced Date,Status,RouteNumber
 
 
 Scenario: Manager should be able to see two more options such as Export to Excel file
           and Print Invoice
 
 #Given User logs into the application as manager
 #When manager selects picking tab
 #Then manager selects Invoiced orders option
 #Then manager clicks on the action button
 
 Scenario: Manager should be able to Edit the Invoiced Details when he
           Click on the Edit Tab from Action dropdown list
 
 #Given User logs into the application as manager
 #When manager selects picking tab
 #Then manager selects Invoiced orders option
 #Then manager clicks on the Action button from the table
 #Then manager clicks Edit tab from the dropdown list of Action button 
 
 Scenario: manager should be able to see the list of Invoiced between the date he wanted to see
 
 #Given User logs into the application as manager
 #When manager selects picking tab
 #Then manager selects Invoiced orders option
 #Then manager clicks on the From Date Search box
 #Then manager clicks on the left Arrow
 #Then manager selects a date from the From date Search Box
 #Then manager clicks on the To Date Search box
 #Then manager select a date from the To date Search Box
 #Then manager click on the submit button
 # manager should be able to see the list of Invoiced between the date he wanted to see
 
 
 Scenario: Manager should be able to download the Invoiced of Particular Order
 
 Given User logs into the application as manager
 When manager selects picking tab
 Then manager selects Invoiced orders option
 Then manager should click on the Action button from the table
 Then manager clicks on the Download Invoice from the dropdown list
     