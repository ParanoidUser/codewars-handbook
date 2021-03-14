import static java.util.regex.Pattern.compile;

interface Trumpdetector {
  static double detect(String trumpySpeech) {
    var stats = compile("(?i)([aeiou])\\1*").matcher(trumpySpeech)
        .results().mapToDouble(r -> r.group().length()).summaryStatistics();
    return Math.round((stats.getSum() / stats.getCount() - 1) * 100.) / 100.;
  }
}