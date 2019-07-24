Feature: My Standard Chartred bank account

Background: Launching of the bank landing page
Given Anshul has done with browser configuration
Then He lauches the application in his favourite chrome browser

Scenario: Sign In for Anshul
Given He clicks on sign in link
Then He enters the valid credentials
And He clicks on Student button

Scenario: Signup for the guest user
Given Guest user clicks on signup link
When he provide all the manadatory details
Then He clicks on start and id generated

Scenario: Anshul want to reset his password
Given he clicks on forgot password link
Then He enters the mobile number
And He receives otp and the same he provided