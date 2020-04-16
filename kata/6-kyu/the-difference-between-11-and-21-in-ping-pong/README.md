# [The difference between 11 and 21 in Ping-Pong](https://www.codewars.com/kata/the-difference-between-11-and-21-in-ping-pong "https://www.codewars.com/kata/5c9df2e8837747001090d307")

Adham Sharara is the sixth president of International Table Tennis Federation (ITTF), and ever since his term of office, he has been a promoter of using `11-point scoring system` to replace the old `21-point scoring system`. Some of the professional ping-pong players retired because they cannot adopt this new scoring system. One of the retired player, Mr.P, wants to know how those two systems differ in impacting the results of the games. So here he comes.  

He formed a string for each game in the following way, and he wants to know the result of this game under two different systems.  
For example, one of the games is showing below:   
`WWWWWWWWWWWWWWWWWWWWWWLW`  
For each `W`, it means Mr.P wins. For each `L`, it means Mr.P's opponent wins. Under the `11-point scoring system`, the current circumstance is that Mr.P wins the first game by 11:0, and wins the second game by 11:0 again. And now the third game is ongoing with the score 1:1 tied. However, under the `21-point scoring system`, the current circumstance is that Mr.P wins the first game by 21:0, and the second game is 2:1 ongoing.  

To express the scores, we have this class `Score` with a constructor like this `new Score(int me, int opponent)` (There are four methods in the `Score` class: the constructor `Score(int me, int opponent)`, the equals method `boolean equals(Object obj)`, the hashcode method `int hashcode()`, and the toString method `String toString()`). Your task is to express the results of the game using `Score` in a List. For instance, the list of the above example should be `[new Score(11, 0), new Score(11, 0), new Score(1, 1), new Score(21, 0), new Score(2, 1)]`. (The results under 11 system come first and those under 21 system come directly afterwards.)  

There are some tips, though, that may be helpful in solving this problem. 
- In order to win in a round, a player must meet two conditions: 1) score at least 11/21 points, and 2) win by at least 2. For example, if the current situation is 10:10 under a 11-point scoring system, the player who wins the next point would not directly win, instead, he/she must win two and change the score to 12:10 in order to win.
- If the new round just starts, namely 0:0, there would be no necessity to expree it in the list.

