import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.joining;
import static org.apache.commons.lang3.StringUtils.rightPad;

import java.util.concurrent.atomic.AtomicInteger;

final class BadWorkHash {
  private static final AtomicInteger SID = new AtomicInteger();

  static String hashString(String toHash) {
    return (toHash.length() > 32 ? toHash.substring(0, 32) : rightPad(toHash, 32, 'a'))
        .chars()
        .mapToObj(n -> n + "")
        .sorted(reverseOrder())
        .map(n -> Integer.toHexString((Integer.parseInt(n) + SID.getAndIncrement()) % 16))
        .collect(joining())
        .toUpperCase();
  }

  private BadWorkHash() {}
}
