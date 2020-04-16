import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.joining;
import static org.apache.commons.lang3.StringUtils.rightPad;

class BadWorkHash {
  static int seq;

  static String hashString(String toHash) {
    return (toHash.length() > 32 ? toHash.substring(0, 32) : rightPad(toHash, 32, 'a'))
        .chars()
        .mapToObj(n -> n + "")
        .sorted(reverseOrder())
        .map(n -> Integer.toHexString((Integer.parseInt(n) + seq++) % 16))
        .collect(joining())
        .toUpperCase();
  }
}
