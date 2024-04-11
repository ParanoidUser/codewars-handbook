# [¡Arrest the cardiac!](https://www.codewars.com/kata/arrest-the-cardiac "https://www.codewars.com/kata/660af4c7fe0da42cceb4af56")

## Problem

A runner has an old, intelligent watch with a GPS that doesn't work, furthermore heart rate monitor is detected only at
the start of the run. So the runner asks you to build a program that calculates the distance traveled using his initial
heart rate and gives you the next instructions:
//HR = Heart rate.

-To calculate maximum HR (MHR) advises you the next formula:
MHR = 220 - age.

-He clarifies that the program should start counting distances at the beginning of the run, time that is exactly when
the watch gives the initial heart rate, and finishes when HR reaches 90% of MHR.

Also, he comments that you must consider the next heart rate intervals:

80% MHR >= Anaerobic.
60% MHR >= Aerobic.
20% MHR >= Soft.

Since depending on the interval in which the runner's heart rate is, each second increases their heart rate by a certain
amount, it asks you to use the following constants:

Anaerobic (0.5 HR/s)
Aerobic (0.25 HR/s)
Soft (0.125 HR/s)

//NOTE: Keep in mind unit measures.
// Distance is always positive and must be rounded.

The task
Create a program that calculates the distance traveled given an initial heart rate, considering HR intervals, previously
mentioned, obtaining the amount of time before reaching 90% of MHR.

int age = age of the runner.
int InitialHR = initial heart rate.
double speed = constant speed of the runner.

Example:

```
getDistance(20,80,5)

//2600

// Maximum heart rate and percentages
// RCM = 220 - 20.
// 200 = 100%
// 180 = 90%
// 160 = 80%
// 120 = 60%
// 80 = 40%
// 40 = 20%

// Corresponding intervals
// 180 - 160 = Interval Anaerobic.
// 160 - 120 = Interval Aerobic.
// 120 - 40 = Interval Soft.

// Getting time.
// Interval Soft = 120 - 80 = 40 / 0.125(Constant Soft) = 320 s
// Interval Aerobic = 160 - 120 = 40 / 0.25(Constant Aerobic) = 160 s
// Interval Anaerobic = 180 - 160 = 20 / 0.5(Constant Anaerobic) = 40 s

// total distance = 520 * 5 (speed) = 2600.
```