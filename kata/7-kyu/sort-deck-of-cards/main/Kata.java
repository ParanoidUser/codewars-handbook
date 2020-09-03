import static java.util.Arrays.sort;
import static java.util.Comparator.comparingInt;

class Kata {
  String[] sortCards(String[] cards) {
    sort(cards, comparingInt("A23456789TJQK"::indexOf));
    return cards;
  }
}
