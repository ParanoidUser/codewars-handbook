# [Fruit Machine](https://www.codewars.com/kata/fruit-machine "https://www.codewars.com/kata/590adadea658017d90000039")

# Introduction

Slot machine (American English), informally fruit machine (British English), puggy (Scottish English slang), the slots (Canadian and American English), poker machine (or pokies in slang) (Australian English and New Zealand English) or simply slot (American English), is a casino gambling machine with three or more reels which spin when a button is pushed. Slot machines are also known as one-armed bandits because they were originally operated by one lever on the side of the machine as distinct from a button on the front panel, and because of their ability to leave the player in debt and impoverished. Many modern machines are still equipped with a legacy lever in addition to the button.

# Task

You will be given three reels of different images and told at which index the reels stop. From this information your job is to return the score of the resulted reels.

# Rules

1. There are always exactly <font color="#A1A85E">three</font> reels<br>
2. Each reel has <font color="#A1A85E">10</font> different items.<br>
3. The three reel inputs may be different.<br>
4. The spin array represents the <font color="#A1A85E">index</font> of where the reels finish.<br>
5. The three spin inputs may be different<br>
6. Three of the same is worth more than two of the same<br>
7. Two of the same plus one <font color="#A1A85E">"Wild"</font> is double the score.<br>
8. No matching items returns <font color="#A1A85E">0</font>.<br>

# Scoring

| Item   | Three of the same | Two of the same | Two of the same plus one Wild |
|:-------|:-----------------:|:---------------:|:-----------------------------:|
| Wild   |        100        |       10        |              N/A              |
| Star   |        90         |        9        |              18               |
| Bell   |        80         |        8        |              16               |
| Shell  |        70         |        7        |              14               |
| Seven  |        60         |        6        |              12               |
| Cherry |        50         |        5        |              10               |
| Bar    |        40         |        4        |               8               |
| King   |        30         |        3        |               6               |
| Queen  |        20         |        2        |               4               |
| Jack   |        10         |        1        |               2               |

# Returns
Return an integer of the <font color="#A1A85E">score</font>.<br>

# Example
## Initialise
```
reel1 = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"}
reel2 = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"}
reel3 = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"}
spin  = {5,5,5}
result = fruit({reel1, reel2, reel3}, spin)
```
## Scoring
```
reel1[5] == "Cherry"
reel2[5] == "Cherry"
reel3[5] == "Cherry"

Cherry + Cherry + Cherry == 50
```
## Return
```
result == 50
```

