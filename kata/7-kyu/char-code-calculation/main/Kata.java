import static org.apache.commons.lang3.StringUtils.countMatches;

interface Kata {
  static int calc(String x) {
    return 6 * x.chars().map(i -> countMatches(i + "", "7")).sum();
  }
}