Feature: Owners

  Scenario: Owner page
    Given I am on the "owners search page"
    And I press "Find Owner"
    When I select owner "George Franklin"
    Then I should see heading "Pets and Visits"
    And I should see pet name "Leo"

  Scenario: Edit Owner
    Given I am on the "owners search page"
    And I press the button "Find Owner"
#    When I follow "George Franklin"
#    And follow "Edit"
#    And fill in "First Name" with "Harold"
#    And press "Update Owner"
#    Then I should see "Owner Information" within "h2"
#    And I should see "Harold Franklin"
#
#  Scenario: Edit Owner
#    Given I am on the "owners search page"
#    And I press "Find Owner"
#    When I follow "George Franklin"
#    And follow "Edit"
#    And fill in "City" with "Minneapolis"
#    And press "Update Owner"
#    Then I should see "Owner Information" within "h2"
#    And I should see "Minneapolis"
#
#  Scenario: Navigate to Add Owner
#    Given I am on the "owners search page"
#    When I follow "Add Owner"
#    Then I should see "Owner" within "h2"
#
#  Scenario: Search Owners
#    Given I am on the "owners search page"
#    When I fill in "Last name" with "Davis"
#    And press "Find Owners"
#    Then I should see "Betty Davis"
#    And I should see "Harold Davis"
