# [Death by Coffee](https://www.codewars.com/kata/death-by-coffee "https://www.codewars.com/kata/57db78d3b43dfab59c001abe")

## Background

I drink too much coffee. Eventually it will probably kill me.

*Or will it...?*

Anyway, there's no way to know.

*Or is there...?*

## The Discovery of the Formula

I proudly announce my discovery of a formula for measuring the life-span of coffee drinkers!

For

* ```h``` is a health number assigned to each person (8 digit date of birth YYYYMMDD)
* ```CAFE``` is a cup of *regular* coffee
* ```DECAF``` is a cup of *decaffeinated* coffee

To determine the life-time coffee limits:

* Drink cups of coffee (i.e. add to ```h```) until any part of the health number includes `DEAD`
* If the test subject can survive drinking <u>five thousand</u> cups without being ```DEAD``` then coffee has no ill effect on them

# Kata Task

Given the test subject's date of birth, return an array describing their life-time coffee limits

```[ regular limit , decaffeinated limit ]```

## Notes

* The limits are ```0``` if the subject is unaffected as described above

* At least 1 cup must be consumed (Just thinking about coffee cannot kill you!)

# Examples

* <b>John</b> was born 19/Jan/1950 so ```h=19500119```. His coffee limits are ```[2645, 1162]``` which is only about 1 cup per week. You
  better cut back John...How are you feeling? You don't look so well.


* <b>Susan</b> (11/Dec/1965) is unaffected by decaffeinated coffee, but regular coffee is very bad for her ```[111, 0]```. Just stick to the
  decaf Susan.


* <b>Elizabeth</b> (28/Nov/1964) is allergic to decaffeinated coffee. Dead after only 11 cups ```[0, 11]```. Read the label carefully Lizzy!
  Is it worth the risk?


* <b>Peter</b> (4/Sep/1965) can drink as much coffee as he likes ```[0, 0]```. You're a legend Peter!!

<hr>

Hint: https://en.wikipedia.org/wiki/Hexadecimal

<hr>

<div style='color:red'>
*Note: A life-span prediction formula this accurate has got to be worth a lot of money to somebody! I am willing to sell my copyright to the highest bidder. Contact me via the discourse section of this Kata.*
</div>