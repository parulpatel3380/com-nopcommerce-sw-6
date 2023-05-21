Feature: Computer menu test case
#  @sanity @regression
  Scenario: Verify product arrange in alphabetical order
    Given I am on the homepage
    And I click on "Computers"
    And I click on desktop
    And I select sort by position Name : Z to A
    Then I can see the product arranged in descending order
#  @smoke @regression
  Scenario: Verify product added to shopping cart successfully
    Given I am on the homepage
    And I click on "Computers"
    And I click on desktop
    And I select Sort By position "Name: A to Z"
    And I click on Add To Cart
    And I verify the Text "Build your own computer"
    And I select processor "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    And I select ram "8GB [+$60.00]" using Select class.
    And I select HDD radio "400 GB [+$100.00]"
    And I select OS radio "Vista Premium [+$60.00]"
    And I check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    Then I can see the computer price "$1,475.00"
    And I click on 'ADD TO CARD' Button.
    Then I can see the Message "The product has been added to your shopping cart" on Top green Bar
    And After that close the bar clicking on the cross button.
    Then MouseHover on 'Shopping cart' and Click on 'GO TO CART' button.
    Then I can see the message "Shopping cart"
    And I change the Qty to 2 and Click on 'Update shopping cart'
    Then I can see the Total "$2,950.00"
    And I click on checkbox 'I agree with the terms of service'
    And I click on 'CHECKOUT'
    Then I see the Text “Welcome, Please Sign In!”
    And I click on 'CHECKOUT AS GUEST' Tab
    And I fill first "fname"
    And I input Last Name "lname"
    And I input email "email"
    And I select country "country"
    And I input City "city"
    And I input Address "address1"
    And I input ZipCode "zipCode1"
    And I input Telephone "telNum"
    And I click on the 'CONTINUE'
    And I click on Radio Button 'Next Day Air($0.00)'
    And I click on 'CONTINUE'
    And I select Radio Button 'Credit Card'
    And I select 'Master card' From Select credit card dropdown
    And I fill all the details
    And I should click on 'CONTINUE'
    And I can see 'Payment Method' is “Credit Card”
    And I can see 'Shipping Method' is “Next Day Air”
    And I can see Total is “$2,950.00”
    And I can click on 'CONFIRM'
    Then I see the Text “Thank You”
    Then I see the message “Your order has been successfully processed!”
    And I click on the 'CONTINUE' button
    Then I can see the text “Welcome to our store”