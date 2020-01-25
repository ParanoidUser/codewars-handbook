import static java.util.stream.Stream.of;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CardGame {
  static String[] getBlackJackWinners(String[] p1, String[] p2, String[] p3, String[] croupier, String... cards) {
    int croupierHand = hand(croupier);
    if (croupierHand == 21 && croupier.length == 2) {
      return new String[0];
    }

    List<String> croupierCards = new ArrayList<>(Arrays.asList(croupier));
    while (croupierHand < 17 && cards.length > 0) {
      croupierCards.add(cards[0]);
      croupierHand = hand(croupierCards.toArray(String[]::new));
      cards = Arrays.copyOfRange(cards, 1, cards.length);
    }

    int p1Hand = hand(p1);
    int p2Hand = hand(p2);
    int p3Hand = hand(p3);

    List<String> luckies = new ArrayList<>();
    if (croupierHand > 21) {
      if (p1Hand < 22) {
        luckies.add("Player 1");
      }
      if (p2Hand < 22) {
        luckies.add("Player 2");
      }
      if (p3Hand < 22) {
        luckies.add("Player 3");
      }
    } else {
      if (p1Hand == 21 && p1.length == 2 || p1Hand < 22 && p1Hand > croupierHand) {
        luckies.add("Player 1");
      }
      if (p2Hand == 21 && p2.length == 2 || p2Hand < 22 && p2Hand > croupierHand) {
        luckies.add("Player 2");
      }
      if (p3Hand == 21 && p3.length == 2 || p3Hand < 22 && p3Hand > croupierHand) {
        luckies.add("Player 3");
      }
    }
    return luckies.toArray(String[]::new);
  }

  static int hand(String[] cards) {
    int hand = of(cards).mapToInt(c -> Math.min(" A2345678910JQK".indexOf(c), 10)).sum();
    for (String card : cards) {
      if ("A".equals(card) && hand < 12) {
        hand += 10;
      }
    }
    return hand;
  }
}
