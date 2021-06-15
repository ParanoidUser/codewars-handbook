import java.util.function.IntPredicate;

interface Kata {
  static String londonCityHacker(Object[] journey) {
    double cost = 0;
    IntPredicate freeTransfer = i -> i < journey.length - 1 && journey[i] instanceof Integer && journey[i + 1] instanceof Integer;
    for (var i = 0; i < journey.length; i += freeTransfer.test(i) ? 2 : 1) {
      cost += journey[i] instanceof String ? 2.4 : 1.5;
    }
    return String.format("£%.2f", cost);
  }
}
