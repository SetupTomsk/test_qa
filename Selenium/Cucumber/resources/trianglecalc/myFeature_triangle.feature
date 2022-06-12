Feature: Сhecking an Equilateral Triangle
Scenario: Calculating Equilateral Triangle
Given I use the triangle calculater
When I clear all parametr
And I set value "3" for side "A"
And I set value "3" for side "B"
And I set value "3" for side "C"
And I Click "Calculate" button
Then The calculated result is "Equilateral Triangle"