import java.util.List;

interface PokerHand {
  static boolean IsStraight(List<Integer> cards) {
    for (int card : cards) {
      if (cards.contains(2) && cards.contains(5) || cards.contains(card + 1) && cards.contains(card + 2) && cards.contains(card + 3) && cards.contains(card + 4)) {
        return true;
      }
    }
    return false;
  }
}
