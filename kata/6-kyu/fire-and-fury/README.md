# [FIRE and FURY](https://www.codewars.com/kata/fire-and-fury "https://www.codewars.com/kata/59922ce23bfe2c10d7000057")

The President's phone is broken

He is not very happy.

The only letters still working are uppercase ```E```, ```F```, ```I```, ```R```, ```U```, ```Y```.

An angry tweet is sent to the department responsible for presidential phone maintenance.


## Task

c the tweet by looking for words with known meanings.


* ```FIRE``` = *<span style='color:yellow'>"You are fired!"</span>*
* ```FURY``` = *<span style='color:yellow'>"I am furious."</span>*

If no known words are found, or unexpected letters are encountered, then it must be a *<span style='color:yellow'>"Fake tweet."</span>*

## Notes

* The tweet reads left-to-right.
* Any letters not spelling words ```FIRE``` or ```FURY``` are just ignored
* If multiple of the same words are found in a row then plural rules apply -
 * ```FIRE``` x 1 = *"You are fired!"*
 * ```FIRE``` x 2 = *"You and you are fired!"*
 * ```FIRE``` x 3 = *"You and you and you are fired!"*
 * etc...
 * ```FURY``` x 1 = *"I am furious."*
 * ```FURY``` x 2 = *"I am really furious."*
 * ```FURY``` x 3 = *"I am really really furious."*
 * etc...

## Examples

* ex1. <span style='background:black'><span style='color:red'>FURY</span>YY<span style='color:red'>FIRE</span>YY<span style='color:red'>FIRE</span></span> = *"I am furious. You and you are fired!"*
* ex2. <span style='background:black'><span style='color:red'>FIRE</span>YY<span style='color:red'>FURY</span>Y<span style='color:red'>FURY</span>YFURRY<span style='color:red'>FIRE</span></span> = *"You are fired! I am really furious. You are fired!"*
* ex3. <span style='background:black'>FYRYFIRUFIRUFURE</span> = *"Fake tweet."*