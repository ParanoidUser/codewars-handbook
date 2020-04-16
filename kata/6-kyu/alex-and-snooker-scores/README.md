# [Alex & snooker: scores](https://www.codewars.com/kata/alex-and-snooker-scores "https://www.codewars.com/kata/58b28e5830473070e5000007")

Alex is a devoted fan of snooker Masters and in particular, he recorded results of all matches. Help Alex to know the score of matches.

<i>Hint:</i><br>
A string with a score presented as follows: <b>"24-79(72); 16-101(53); ..."</b><br>
"24" - Points scored the first player;<br>
"79" - the number of points of the second player.<br>
"(72)" - the maximum score for one approach.<br>
Also, the player's account may be expressed as 105(53,52):<br>
"105" - points in the frame, "53" and "52" - two separate numbers(not float) maximum points in the frame.<br>
Frames are separated by ";" and players score - "-"<br>
It should count the number of frames won by one and another player, and output the data as a "[10,7]"<br>