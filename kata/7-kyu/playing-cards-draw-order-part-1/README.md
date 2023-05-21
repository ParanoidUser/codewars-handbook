# [Playing Cards Draw Order – Part 1](https://www.codewars.com/kata/playing-cards-draw-order-part-1 "https://www.codewars.com/kata/630647be37f67000363dff04")

In this series of two kata, we will draw playing cards from a deck using a particular procedure: after drawing one
card, we place the next one at the bottom of the deck.

In details, the procedure is:

1. We draw the top card of the deck.
2. We take the next card, and put it at the bottom of the deck.
3. We repeat steps 1 and 2 until there aren't any card left in the deck.

Let's take a small deck containing four cards — named A, B, C, D — as an example:

1. The deck order is `A-B-C-D` at the beginning, the card `A` is at the top and `D` at the bottom.
2. `A` is drawn. The deck is now `B-C-D`.
3. `B` is placed at the bottom of the deck. The deck is now `C-D-B`.
4. `C` is drawn. The deck is now `D-B`.
5. `D` is placed at the bottom of the deck. The deck is now `B-D`.
6. `B` is drawn. The deck is now `D`.
7. `D` is drawn.

The order of the cards drawn is `A-C-B-D`.

## Your task

Write a function accepting a deck of cards as argument, and returning the cards drawn following the procedure.

```
public static List<String> draw(List<String> deck){
```

Each card is represented with a two-character string: the rank of the card and its suit.

`AC 2C 3C 4C 5C 6C 7C 8C 9C TC JC QC KC` for the Clubs<br />
`AD 2D 3D 4D 5D 6D 7D 8D 9D TD JD QD KD` for the Diamonds<br />
`AH 2H 3H 4H 5H 6H 7H 8H 9H TH JH QH KH` for the Hearts<br />
`AS 2S 3S 4S 5S 6S 7S 8S 9S TS JS QS KS` for the Spades<br />

A preloaded function allows to easily print a deck to the console:

```
DeckPrinter.printDeck(deck,unicode);
```

The first argument is the deck to print, the second one is a boolean value allowing the selection of the character set:
regular or Unicode (for which a font containing the playing cards characters needs to be installed on your system).

## Example

```
List<String> deck=Arrays.asList(new String[]{"KC","KH","QC","KS","KD","QH","QD","QS"});

        CardDraw.draw(deck);
```

should return:

```
["KC","QC","KD","QD","KH","QH","KS","QS"];
```