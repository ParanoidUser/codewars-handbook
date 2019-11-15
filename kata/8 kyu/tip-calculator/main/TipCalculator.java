import java.util.Map;

class TipCalculator {
  static Integer calculateTip(Double amount, String rating) {
    var rates = Map.of("terrible", .0, "poor", .05, "good", .1, "great", .15, "excellent", .2);
    return rates.containsKey(rating.toLowerCase()) ? (int) (Math.ceil(amount * rates.get(rating.toLowerCase()))) : null;
  }
}
