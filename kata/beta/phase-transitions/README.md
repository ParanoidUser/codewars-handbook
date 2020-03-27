# [Phase Transitions](https://www.codewars.com/kata/phase-transitions "https://www.codewars.com/kata/5c866052ba8bd554757aa4b4")

This kata is an issue from Effective Java (by Joshua Bloch).

You have 3 Phases:
- SOLID
- LIQUID
- GAS

And there are certain transitions between these phases:
- SOLID -> LIQUID = MELT
- LIQUID -> SOLID = FREEZE
- LIQUID -> GAS = BOIL
- GAS -> LIQUID = CONDENSE
- SOLID -> GAS = SUBLIME
- GAS -> SOLID = DEPOSIT

Your task is to return the correct transition when you got the first and second phase as String parameters.
Note:
- no invalid input
- all input and output is CAPS
- no identical transition eg: SOLID -> SOLID is not a valid input