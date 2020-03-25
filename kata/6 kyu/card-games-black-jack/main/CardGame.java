import static java.util.stream.Stream.of;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;

class CardGame {
  static String[] getBlackJackWinners(String[] p1, String[] p2, String[] p3, String[] croupier, String... cards) {
    int house;
    while ((house = count(croupier)) < 17 && cards.length > 0) {
      croupier = Arrays.copyOf(croupier, croupier.length + 1);
      croupier[croupier.length - 1] = cards[0];
      cards = Arrays.copyOfRange(cards, 1, cards.length);
    }

    Predicate<String[]> blackjack = hand -> hand.length == 2 && count(hand) == 21;

    var win = new ArrayList<String>();
    if (!blackjack.test(croupier)) {
      var players = Map.of(1, p1, 2, p2, 3, p3);
      for (int i = 1; i <= players.size(); i++)
        if (blackjack.test(players.get(i)) || count(players.get(i)) < 22 && (house > 21 || count(players.get(i)) > house))
          win.add("Player " + i);
    }
    return win.toArray(new String[0]);
  }

  static int count(String[] cards) {
    int hand = of(cards).mapToInt(c -> Math.min(" A2345678910JQK".indexOf(c), 10)).sum();
    for (String card : cards) {
      if ("A".equals(card) && hand < 12) hand += 10;
    }
    return hand;
  }
}
