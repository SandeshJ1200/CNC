Feature: This File Contains the Test cases on Dispatch and Deliveries From Manager module

Scenario: manager should be able to see Delievered list of orders

#Given user logs into the application as a manager
#Then manager selects Dispatch and Deliveries Tab
#Then manager click on the Deliveries List

Scenario: manager should see the list of Deleveries when clicks on the Manifest number from the table
          and manager should be able to Print it.
          
#Given user logs into the application as a manager
#Then manager selects Dispatch and Deliveries Tab
#Then manager click on the Deliveries List
#Then manager click on the Manifest Number from the table
#Then manager click on the Print button   

Scenario: manager should be able to search the customer delivery list with manifest number

Given user logs into the application as a manager
Then manager selects Dispatch and Deliveries Tab
Then manager click on the Deliveries List
Then manager click on the Search Text box
Then manager pass the manifest number       