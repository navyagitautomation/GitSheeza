
@tag
Feature: login  to Facebook application

  @tag1
  Scenario: login with valid credentials
   Given user lauch FB application
   And enters username and password
   Then click on Login button
  
  @tag2
  Scenario: login with not valid credentials
   Given user lauch FB application
   And enters "Navya" and "1233"
   Then click on Login button
   @tag3
  Scenario: login with not valid credentials
   Given user lauch FB application
   And enters "<Username>" and "<pwd>" 
   Then click on Login button
 
    Examples:
   |Username|pwd    |
   |A123    |A887   |
   |B12     |B76    |
   |Asd@yt  |qwee   |
   |ASDF    |AS@tr  |
   
   