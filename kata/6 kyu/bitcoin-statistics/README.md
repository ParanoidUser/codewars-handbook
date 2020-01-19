# [Bitcoin statistics](https://www.codewars.com/kata/bitcoin-statistics "https://www.codewars.com/kata/5a7f6b615084d75df6000032")

Your friend Phil came up with a great new Bitcoin investment strategy, but before he can start making millions, he needs to know the minimum, average and maximum exchange rate for certain periods in the last few months.

He'll pay you 0.5 Bitcoin for a function that takes several arrays (one for each period) and calculates the minimum, average and maximum for each array, as well as the total minimum, average and maximum. Some numbers at the start and end of each period don't agree with Phil's theory, so he wants you to discard them.

For example, for the input

```
discard = 2
array 0 = 800,1200,2100,4100,1300,700 // discard 800,1200 at start and 1300,700 at end
array 1 = 1000,1500,4500,5000,5800,2000,1500 // discard 1000,1500 at start and 2000,1500 at end
```

your function should return

```
array 0 = 2100,3100,4100 // min, avg, max for input array 0 (without discarded values)
array 1 = 4500,5100,5800 // min, avg, max for input array 1 (without discarded values)
array 2 = 2100,4300,5800 // total min, avg, max (without discarded values)
```