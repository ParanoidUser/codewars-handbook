import static org.apache.commons.lang3.StringUtils.countMatches;

interface CodeWars {
  static int strCount(String str, char letter) {
    return countMatches(str, letter);
  }
}
