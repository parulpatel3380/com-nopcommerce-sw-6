Feature: Electronics menu test case

  Scenario: Verify user should navigate to cell phones page successfully
    Given I am on the homepage
    And I hove on 'Electronics' Tab
    And I hover and click on 'Cell phones'
    Then I can see the text "Cell phones"

  @sanity
  Scenario: Verify that the product added successfully and place order successfully
    Given I am on the homepage
    And I hove on 'Electronics' Tab
    And I hover and click on 'Cell phones'
    Then I can see the text "Cell phones"
    And I click on List View Tab
    And I click on product name “Nokia Lumia 1020” link
    Then I can see the text “Nokia Lumia 1020”
    Then I can see the price “$349.00”
    And I change quantity to 2
    And I click on “ADD TO CART” tab
    Then I can see the Message 'The product has been added to your shopping cart' on Top green Bar
    And after that close the bar clicking on the cross button.
    Then MouseHover on 'Shopping cart' and Click on "GO TO CART" button.
    Then I can see the message 'Shopping cart'
    Then I can see the quantity is 2
    Then I can see the Total $698.00
    And I click on checkbox “I agree with the terms of service”
    And I click on the 'CHECKOUT'
    Then I can see Text “Welcome, Please Sign In!”
    And I click on 'REGISTER' tab
    Then I can see the text 'Register'
    And I fill the mandatory fields
    And I click on 'REGISTER' Button
    Then I can see the message “Your registration completed”
    And I click on 'CONTINUE' tab
    And I can see the text “Shopping card”