Feature: checkout

Scenario: Checkout a banana

Given the price of a "banana" is 40 
When I checkout 1 "banana" 
Then the total price should be 40 

Scenario: Two bananas are scanned separately
Given the price of a "banana" is 40 in B
When I checkout 1 "banana" in B
And I checkout 1 "banana" in B
Then the total price should be 80 in B

Scenario: a banana and Apple
Given the price of a "banana" is 40 in C
And the price of a "apple" is 25 in C
When I checkout 1 "banana" in C
And I checkout 1 "apple" in C
Then the total price should be 65 in C
