import static org.apache.commons.lang3.StringUtils.countMatches;

class CodeWars {
  static int strCount(String str, char letter) {
    return countMatches(str, letter);
  }
}
