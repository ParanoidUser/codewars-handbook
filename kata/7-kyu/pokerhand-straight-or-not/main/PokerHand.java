import java.util.List;

class PokerHand {
  static boolean IsStraight(List<Integer> cards) {
    for (int card : cards) {
      if (card == 14 && cards.contains(2) && cards.contains(3) && cards.contains(4) && cards.contains(5) ||
          cards.contains(card + 1) && cards.contains(card + 2) && cards.contains(card + 3) && cards.contains(card + 4)) {
        return true;
      }
    }
    return false;
  }
}
