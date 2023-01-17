# [Bingo Card](https://www.codewars.com/kata/bingo-card "https://www.codewars.com/kata/566d5e2e57d8fae53c00000c")

After yet another dispute on their game the Bingo Association decides to change course and automize
the game.

Can you help the association by writing a method to create a random Bingo card?

<b style='font-size:16px'>Task:</b>

<ul>

<li>Finish method:</li>

```
BingoCard.getCard()
```

<li>A Bingo card contains 24 unique and random numbers according to this scheme:
<ul>
<li>5 numbers from the B column in the range 1 to 15</li>
<li>5 numbers from the I column in the range 16 to 30</li>
<li>4 numbers from the N column in the range 31 to 45</li>
<li>5 numbers from the G column in the range 46 to 60</li>
<li>5 numbers from the O column in the range 61 to 75</li>
</ul>
</li>
<br>

<li>The card must be returned as an array of Bingo style numbers: </li>

```
{ "B14", "B12", "B5", "B6", "B3", "I28", "I27", ... }
```

<li>The numbers must be in the order of their column: B, I, N, G, O. Within the columns the order of the numbers is random. 

</ul>

![](https://myfreebingocards.com/numbers/1-75/printable-bingo-card-generator/link_img.png)