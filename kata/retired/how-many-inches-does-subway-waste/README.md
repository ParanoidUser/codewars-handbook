# [How many inches does Subway waste?](https://www.codewars.com/kata/how-many-inches-does-subway-waste "https://www.codewars.com/kata/5f72e43d05f4fa001d40e59e")

Paul is a manager at Subway Kataville. In this peculiar branch of Subway, customers may only order their sandwiches as a 6-inch (no foot longs!).

When a customer orders a 6-inch sandwich of a particular bread, the employee either cuts a foot long bread in half, and keeps the other half spare for later, or uses an existing spare that was already cut earlier.

At the end of the day in Kataville, any half cut breads are discarded as waste. Paul wants you to design a system that will tell him how many inches of bread have been discarded at the end of the day so he can still keep track on his days off!

The bread types available are
9-Grain Wheat, 9-Grain Honey Oat, Italian, Hearty Italian, Italian Herb & Cheese, and Flatbread.

Complete the subwayWastage function to determine how many inches are wasted. For example

```subwayWastage("Italian", "9-Grain Wheat", "Flatbread") = 18```
Because the spare halves of those 3 types of bread were never used, so there are 3 lots of 6 inches wasted, which is a total of 18 inches.

```subwayWastage("Italian", "Flatbread", "Italian", "Flatbread") = 0```
As there is an Italian order, leaving a spare, and a Flatbread order, leaving a spare, then the spare Italian is used followed by the spare Flatbread, leaving no spares as waste at the end of the day.

