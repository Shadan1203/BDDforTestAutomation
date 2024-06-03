Feature: Withdraw cash from bank account
  In orer to pay for daily expenses
  As an account holder
  I want to withdraw cash 

  Scenario: Withdraw cash from bank account in credit
    Given I have a balance of $100 in my account
    When I request $20
    Then $20 should be dispensed
    
