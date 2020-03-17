@Jpet_Application_feature
Feature: JPET STORE

@tc01_validlogin
Scenario: login with valid details
Given : enter the username and password
When : click on login button
Then : open's the homepage
And : confirming the profile

@tc02_addingdifferentproducts
Scenario: add different products to the cart
Given : search for different products
When : Add them to the cart
Then : update the cart
And : proceed to checkout

@tc03_myorders
Scenario: checking out myorders
Given : click on myaccount in the homepage
When : click on myorders
Then : check your orders
And : go to main menu


