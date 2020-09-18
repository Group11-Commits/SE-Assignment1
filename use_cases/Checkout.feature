Feature: Checkout

Scenario: Checkout a banana

Given the price of a "banana" is 40
When I checkout 1 "banana"
Then the total price should be 40

Scenario: Two bananas are scanned separately
Given the price of a "banana" is 40 in sc2
When I checkout 1 "banana" in sc2
And I checkout 1 "banana" in sc2
Then the total price should be 80 in sc2

Scenario: a banana and Apple
Given the price of a "banana" is 40 in sc3
And the price of a "apple" is 25 in sc3
When I checkout 1 "banana" in sc3
And I checkout 1 "apple" in sc3
Then the total price should be 65 in sc3