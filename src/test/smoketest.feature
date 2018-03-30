Feature: Browsing around

  Scenario: The home page
    Given I am on the home page of petclinic
    Then I should see "Welcome"

#  Scenario: Owner page
#    Given I am on the "owners search page"
#    And I press "Find Owner"
#    When I follow "George Franklin"
#    Then I should see "Pets and Visits"
#    And I should see "Leo"
#
#  Scenario: Test
#    Given I am on the "home page"
#    Given I am on the "owners search page"
#    Given I am on the "new owner page"
#
#
#  Scenario: Alternatieven voorbeeld
#    Given I open nos.nl
#    Given I launch nos.nl
#    Given I am at nos.nl
