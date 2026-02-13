Feature: Checking Login & Logout Functionalities of Swag Labs

Scenario: EndToEnd Tetsing Swag Labs Functionalities

Given User Should open Chrome Browser
When User Should Enter URL "https://www.saucedemo.com/" in Search Box
And User Shloud click on Search PushButton
When User Should navigate to Home Page
And User Should Enter username and password in Edit box
And User Should Click on Login PushButton
Then Message displayed Swag Labs Successfully
Then User Should Place hand over on Sauce Labs Backpack item and Click
Then User Should Click on Add to Cart PushButton
Then User Should Click on Continue Shoping PushButton
And User should place hadn over on Sauce Labs Bike Light item
And User Should Click on Add to Cart PushButton
And User Should Click on checkout
Then User Should Quit Swag Labs Application
 