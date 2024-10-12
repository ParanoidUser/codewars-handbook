# [The wheat/rice and chessboard problem](https://www.codewars.com/kata/the-wheat-slash-rice-and-chessboard-problem "https://www.codewars.com/kata/5b0d67c1cb35dfa10b0022c7")

I assume most of you are familiar with the ancient legend of the rice (but I see wikipedia suggests [wheat](https://en.wikipedia.org/wiki/Wheat_and_chessboard_problem), for some reason) problem, but a quick recap for you: a young man asks as a compensation only `1` grain of rice for the first square, `2` grains for the second, `4` for the third, `8` for the fourth and so on, always doubling the previous.

Your task is pretty straightforward (but not necessarily easy): given an amount of grains, you need to return up to which square of the chessboard one should count in order to get at least as many.

As usual, a few examples might be way better than thousands of words from me:

```
0 grains need 0 cells
1 grain needs 1 cell
2 grains need 2 cells
3 grains need 2 cells
4 grains need 3 cells
and etc.
```

Input is always going to be valid/reasonable: ie: a non negative number; extra cookie for *not* using a loop to compute square-by-square (at least not directly) and instead trying a smarter approach [hint: some peculiar operator]; a trick converting the number might also work: impress me!
