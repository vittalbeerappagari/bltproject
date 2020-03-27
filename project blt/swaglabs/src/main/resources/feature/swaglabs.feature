Feature: Test swaglabs
	
	@TC01_Swaglabs
  Scenario Outline: Test login with valid credentials
    Given Open chrome and start application
    When User enter valid "<username>" and valid "<password>"
    Then user should be able to login successfully
    Then close the application

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

	@TC02_Swaglabs
  Scenario: Test whether the user is able to add the product to the cart
    Given Open chrome and start application
    When user should login with valid credentials
    Then user should be able to add the product to the cart
    Then close the application

	@TC03_Swaglabs
  Scenario: Test whether the user is able to click the about and naviagate to required page
    Given Open chrome and start application
    When user should login with valid credentials
    Then user should click the about by clicking on the home button and navigate to next page
    Then select anyone field in the about page
    Then close the application
