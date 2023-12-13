#Author: pradeepa.pandiyan@aroopatech.com
Feature: To ensure the Form Submission flow
Scenario: User try to submit the  HCP  portal form
    Given User is on the login page
    When User enters valid username and password
    Then User should be redirected to the home page
    And the user profile should be displayed
    Given User is on the form submission page
    Then User should see a success message
    
#Scenario: User try to submit the Grants portal form
    