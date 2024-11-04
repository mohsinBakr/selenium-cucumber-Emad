Feature: Search for product
  As a customer I want to go to the online store and search for nokia

  @NopCom_SearchForProduct_1
  Scenario Outline: Go to landing page and search for "<product>" then assert that the result is: "<Expected>"
    Given Verify that home page is displayed
    When search for "<product>" in the search field
    And Click Search Button
    Then I should find "<Expected>" in the results
    Examples:
      | product | Expected                                    |
      | samsung | Samsung Series 9 NP900X4C Premium UltrabookX |