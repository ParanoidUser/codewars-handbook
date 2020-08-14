# [Approaching enemies](https://www.codewars.com/kata/approaching-enemies "https://www.codewars.com/kata/56d58a16e8f2d6957100093f")

You are in a military mission in the middle of the jungle where your enemies are really hard to spot because of their camouflage. Luckily you have a device that shows the position of your enemies!

Your device is a radar that computes the ```x``` and ```y``` coordinates of an enemy in meters ```every 5 seconds```. You are always at the point ```(0, 0)``` and your enemies are always heading towards you.

<h2>Your task</h2>

The radar will give you two consecutive points ```P1(x, y)``` and ```P2(x, y)``` of an enemy and you should write a function that will return the estimated time in seconds that the enemy will take to reach you, so you can defend! <b>Python results should be rounded to 3 decimal places.</b> 

<h2>Hints</h2>

<a href="https://en.wikipedia.org/wiki/Euclidean_distance" target="_blank">Distance between two points</a>. Remember that you are working with only 2 dimensions!

Tests will have a precision of 3 decimal points.