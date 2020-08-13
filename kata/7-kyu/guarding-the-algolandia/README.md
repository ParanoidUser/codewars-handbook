# [Guarding the AlgoLandia](https://www.codewars.com/kata/guarding-the-algolandia "https://www.codewars.com/kata/5d0d1c14c843440026d7958e")

In a far away country called AlgoLandia, there are `N` islands numbered `1` to `N`. Each island is denoted by `k[i]`. King Algolas, king of AlgoLandia, built `N - 1` bridges in the country. A bridge is built between islands `k[i]` and `k[i+1]`. Bridges are two-ways and are expensive to build.

The problem is that there are gangs who wants to destroy the bridges. In order to protect the bridges, the king wants to assign an elite guards to the bridges. A bridge between islands `k[i]` and `k[i+1]` is safe when there is an elite guard in island `k[i]` or `k[i+1]`. There are already elite guards assigned in some islands.

Your task now is to determine the minimum number of additional elite guards that needs to be hired to guard all the bridges.

## Note:
You are given an array `k` with `N` length.
`k[i] = true`, means that there is an elite guard in that island; `k[i] = false` means no elite guard.

### Sample Input 1
```
k = [true, true, false, true, false]
```
### Sample Output 1
```
0
```

### Sample Input 2
```
k = [false, false, true, false, false]
```
### Sample Output 2
```
2
```