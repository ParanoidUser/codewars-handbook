# [The Hunting of the Snark](https://www.codewars.com/kata/the-hunting-of-the-snark "https://www.codewars.com/kata/64559f6100c679005842bc77")

Inspired by Lewis Carroll's nonsensical poem *The Hunting of the Snark.*

You and your friends are hunting Snarks, with you as their leader. You are well knowledgeable about Snarks and know that Snarks are not
typically dangerous. However, Snarks that are also Boojums are incredibly lethal creatures.

You are equipped with a Boojumeter, a device that measures the boojimmity levels in an 8.5-meter radius, showing individual boojimity
concentrations per square meter.

You also wield a fancy Blimble Bloognifier, a device that displays living things found in an 8.5-meter radius.

Both are fashioned in length 17 arrays in a matrix like this:

Boojumeter-

 ```
 V--- YOU ARE HERE
{0, 0, 2, 1, 0, 0, 4, 2, 0, 0, 16, 12, 8, 5, 0, 0, 2}
 ```

Blimble Bloognifier-

 ```
 V--- YOU ARE HERE 
{"giant horse", "the hog", "", "snork", "", "", "deadly snake", "chipmunk", "a dingus", "The", "snark", "allgrimble", "sneet", "sningus", "snart","","slungus"}
 ```

a Snark is always identified simply by "snark"

Since the economy collapsed, the world has been reduce to 2-D and you don't need to worry about the 3rd dimension. Since there are no snarks
in the sky or ground, you do not need to worry about what is above or below you, so your tools only measure one dimension.

The middle of the array, index 8, is where your group is and the other numbers are the boojimmity levels of meter areas; your distance from
them is the distance in the array. i.e. index 3 is 1 meter away from index 4, index 4 is 3 meters away from index 1

Requisites for Danger:
--------------------------

A Snark is only a Boojum if its boojimity reaches or surpasses 15.

There is only one Snark per 8.5 meters due to their putrid odor.

There is no need to worry about non-Snark Boojums because they are easily throwable.


Your job is to determine what to do based on your readings.
-----------------------

If you are within **2 meters (inclusive)** away from a Snark, return "Pounce!"

If that Snark be a Boojum, instead return "Run!"

If you are within **3-4 meters (inclusive)** away from a Snark, return "Stalk quietly..."

If that Snark be a Boojum, instead return "Escape quietly..."

If there is **any Snark at all** that does not meet the above specifications, return "There's a Snark close."

If that Snark be a Boojum, instead return "There's a Boojum close."

If there is **no Snark**, return "Keep hunting."

If that Snark be a boojum, you're lying because there isn't a Snark.