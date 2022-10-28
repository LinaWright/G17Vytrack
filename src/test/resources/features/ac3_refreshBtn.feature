@refreshBtn
Feature:User should be able to click the refresh button

Background:
  Given the user is on the login page
  When the user is logged in and on Fleet Management page
  And the user clicks on Fleet module
  And the user clicks on Vehicles subcategory
  And the user should see the Vehicles page with Cars header


  Scenario: store manager clicks reset button
    And the user should be able to click on the refresh button
