# [The Millionth Fibonacci Kata](https://www.codewars.com/kata/the-millionth-fibonacci-kata "https://www.codewars.com/kata/53d40c1e2f13e331fc000c26")

The year is 1214. One night, Pope Innocent III awakens to find the the archangel Gabriel floating before him. Gabriel thunders to the pope:

> Gather all of the learned men in Pisa, especially Leonardo Fibonacci. In order for the crusades in the holy lands to be successful, these men must calculate the *millionth* number in Fibonacci's recurrence. Fail to do this, and your armies will never reclaim the holy land. It is His will.

The angel then vanishes in an explosion of white light.

Pope Innocent III sits in his bed in awe. *How much is a million?* he thinks to himself. He never was very good at math.

He tries writing the number down, but because everyone in Europe is still using Roman numerals at this moment in history, he cannot represent this number. If he only knew about the invention of zero, it might make this sort of thing easier.

He decides to go back to bed. He consoles himself, *The Lord would never challenge me thus; this must have been some deceit by the devil. A pretty horrendous nightmare, to be sure.*

Pope Innocent III's armies would go on to conquer Constantinople (now Istanbul), but they would never reclaim the holy land as he desired.

---------------------------

In this kata you will have to calculate `fib(n)` where:

	fib(0) := 0
	fib(1) := 1
	fib(n + 2) := fib(n + 1) + fib(n)

Write an algorithm that can handle `n` up to `2000000`.

Your algorithm must output the exact integer answer, to full precision. Also, it must correctly handle negative numbers as input.

**HINT I**: Can you rearrange the equation `fib(n + 2) = fib(n + 1) + fib(n)` to find `fib(n)` if you already know `fib(n + 1)` and `fib(n + 2)`? Use this to reason what value `fib` has to have for negative values.

**HINT II**: See https://web.archive.org/web/20220614001843/https://mitpress.mit.edu/sites/default/files/sicp/full-text/book/book-Z-H-11.html#%_sec_1.2.4
