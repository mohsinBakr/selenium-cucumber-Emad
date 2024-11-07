Feature: Search for product
  As a customer I want to go to the online store and search for nokia

  @SWICA_Portal_Landing
  Scenario Outline: Go to SWICA landing page and verify landing page elements existance
    Given Verify that home page is displayed
    When Click Accept Cookies
    Examples:
      | product | Expected                                    |
      | Nokia   | Nokia Lumia 1020                            |