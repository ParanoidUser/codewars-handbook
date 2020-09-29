import static java.security.MessageDigest.getInstance;
import static java.util.stream.IntStream.range;

import java.math.BigInteger;

class CodeWars {
  String crack(String hash) {
    return range(0, 100000).mapToObj(i -> String.format("%05d", i)).filter(
        pin -> {
          try {
            return new BigInteger(1, getInstance("MD5").digest(pin.getBytes())).toString(16).equals(hash);
          } catch (Exception fatal) {
            throw new IllegalStateException(fatal);
          }
        }
    ).findFirst().orElse("");
  }
}