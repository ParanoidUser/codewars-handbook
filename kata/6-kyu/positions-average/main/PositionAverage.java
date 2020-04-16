import static java.util.stream.IntStream.range;

class PositionAverage {
  static double posAverage(String s) {
    var nums = s.split(", ");
    double occurs = 0, total = nums.length * (nums.length - 1) / 2.;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        String a = nums[i], b = nums[j];
        occurs += range(0, a.length()).filter(k -> a.charAt(k) == b.charAt(k)).count();
      }
    }
    return occurs / nums[0].length() / total * 100;
  }
}
