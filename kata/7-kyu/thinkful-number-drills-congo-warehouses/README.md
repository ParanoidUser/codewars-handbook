# [Thinkful - Number Drills: Congo warehouses](https://www.codewars.com/kata/thinkful-number-drills-congo-warehouses "https://www.codewars.com/kata/5862e7c63f8628a126000e18")

Your company, [Congo Pizza](https://interesting-africa-facts.com/Africa-Landforms/Congo-Rainforest-Facts.html),
is the second-largest online frozen pizza retailer. You own a number of international warehouses
that you use to store your frozen pizzas, and you need to figure out how many crates of pizzas you
can store at each location.

Congo recently standardized its storage containers: all pizzas fit inside a *cubic crate, 16-inches
on a side*. The crates are super tough, so you can stack them as high as you want.

Write a function `box_capacity()` that figures out how many crates you can store in a given
warehouse. The function should take three arguments: the length, width, and height of your
warehouse (in feet) and should return an integer representing the number of boxes you can store in
that space.

For example: a warehouse 32 feet long, 64 feet wide, and 16 feet high can hold 13,824 boxes because
you can fit 24 boxes across, 48 boxes deep, and 12 boxes high, so `box_capacity(32, 64, 16)` should
return `13824`.