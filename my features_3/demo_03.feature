Feature: Test Me parametrisation




Scenario Outline: Test me login for multiple user

Given I am launching the test me application
And I click on signin link
When I provide Username"<Uname>"
And I provide password"<pswrd>"
Then I click on login and verify the login status

Examples:
| Uname   | pswrd   |
| Anshul  | pass123 |
| name2   | pass7   |