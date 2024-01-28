# [Tug-o'-War](https://www.codewars.com/kata/tug-o-war "https://www.codewars.com/kata/547fb94931cce5f5de00024f")

In this Kata we will play a classic game of Tug-o'-War!

Two teams of 5 members will face off, the strongest of which will prevail.  Each team member will be assigned a strength rating (1-9), with the most powerful members having a rating of 9.  Your goal is to determine, based on the cumulative strength of the members of each team, which team will win the war.   

The teams will be represented by an array of arrays:

```
new int[][]{new int[]{5, 0, 3, 2, 1}, new int[]{1, 6, 8, 2, 9}} // 11 < 26 ; "Team 2 wins!"
```

Your task is to return a string with which team won or if it was a tie.

 - If team one is stronger, return the string "Team 1 wins!"
 - If team two is stronger, return the string "Team 2 wins!"

If the two teams are of equal strength, the team with the strongest Anchor (the member furthest from the center of the rope) will win.  In the above example, the member with strength 5 is team one's Anchor and strength 9 is team two's Anchor.

 - If the teams and the Anchors are both of equal strength, return the string "It's a tie!" 

The Anchors are members in each end of the rope:

![anchors](https://i.imgur.com/w3MJF2V.jpg)

more examples:

```
new int[][]{new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}} // Team 2 has stronger Anchor ; "Team 2 wins!"
new int[][]{new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}} // Teams & Anchors are tied; "It's a tie!"
```