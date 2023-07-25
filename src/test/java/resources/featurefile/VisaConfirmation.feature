@regression
Feature: Visa Confirmation
  As user I want to search visa information on home office visa website

  @smoke
  Scenario Outline: I am an Australian Coming To UK For Tourism
    Given I am on home page
    When I am on start page
    And I select a nationality "<nationality>"
    And I click on continue button
    And I select "<reason>"
    And I click on next continue button
    Then I should see the result message "<expectedMessage>"

    Examples:
      | nationality | reason                                 | expectedMessage                            |
      | Australia   | Tourism or visiting family and friends | You will not need a visa to come to the UK |

  @sanity
  Scenario Outline: I am a Chilean Coming To UK For Work academic visit or business
    Given I am on home page
    When I am on start page
    And I select a nationality "<nationality>"
    And I click on continue button
    And I select "<reason>"
    And I click on next continue button
    And I select duration "<duration>"
    And I click on next step continue button
    Then I should see the result msg "<expectedMsg>"

    Examples:
      | nationality | reason                           | duration | expectedMsg                                                                                                             |
      | Chile       | Work, academic visit or business | 1        | You do not need a visa for some business and academic activities, but you must get a visa if you plan to work in the UK |

  Scenario Outline: I am a Colombia Coming To UK For Join partner or family for a long stay
    Given I am on home page
    When I am on start page
    And I select a nationality "<nationality>"
    And I click on continue button
    And I select "<reason>"
    And I click on next continue button
    Then I should see the result messages "<expectedMessages>"

    Examples:
      | nationality | reason                                 | expectedMessages                           |
      | Colombia   | Join partner or family for a long stay | You may need a visa |