Feature: This Feature contains test case of Invoiced orders




Scenario: 

 Given User logs into the application as manager
 When manager selects picking tab
 Then manager selects Invoiced orders option
 #Then manager should see customer Invoiced Details


Scenario:

 Given User logs into the application as manager
 When manager selects picking tab
 Then manager selects Invoiced orders option
 Then manager clicks on Search Text Box
 Then manager should be able to search customer with Name,OrderID,Invoiced Date,Status,RouteNumber