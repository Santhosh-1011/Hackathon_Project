Feature: Display BookShelves

  Scenario: Search BookShelves
    Given User should enter BookShelves in the searchbox
    When click the searchicon
    And User should click the close popup icon
    And User should click the category option in the filter
    And click the kids BookShelves  checkbox
    And User should click the price option in the filter
    And adjust the slider with the given details
    And click the exclude stock checkbox
    And User should click the Recommended option in the page
    And select the High To Low price value
    Then Display Name and Price of the KidsBookShelves
    When user should click the living option in the page
    Then Display values under the Living storage
    When User should click the giftcards in the given page
    And user should click the Birthday/Anniversary option in the given page
    And Enter the details under giftcard
    And User should click the next button
    When user should enter the details
    Then validate the warning message in the To checkbox
    And validate the warning message in the From checkbox
    And click the confirm button
