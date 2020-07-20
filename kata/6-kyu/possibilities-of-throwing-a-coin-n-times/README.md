# [Possibilities of throwing a coin n times](https://www.codewars.com/kata/possibilities-of-throwing-a-coin-n-times "https://www.codewars.com/kata/5ad6266b673f2f067b000004")

In this kata you will be given an **integer n**, which is the number of times that is thown a coin. You will have to return an array of string for all the possibilities (heads[H] and tails[T]). Examples:<br><br>
```coin(1) should return {"H", "T"}```<br>
```coin(2) should return {"HH", "HT", "TH", "TT"}```<br>
```coin(3) should return {"HHH", "HHT", "HTH", "HTT", "THH", "THT", "TTH", "TTT"}```<br><br>
When finished sort them alphabetically.<br>
<br>
In C and C++ just return a ```char*``` with all elements separated by```,``` (without space):<br>
```coin(2) should return "HH,HT,TH,TT"```<br><br>
INPUT:<br>
```0 < n < 18```<br><br>
Careful with performance!! You'll have to pass 3 basic test (n = 1, n = 2, n = 3), many medium tests (3 < n <= 10) and many large tests (10 < n < 18)