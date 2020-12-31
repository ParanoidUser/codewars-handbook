import static java.security.MessageDigest.getInstance;
import static java.util.stream.IntStream.range;

import java.math.BigInteger;
import java.util.stream.Stream;

interface Cracker {
  static String crackSha256(String hash, String chars) {
    return permutations(chars).filter(opt -> {
          try {
            return String.format("%064x", new BigInteger(1, getInstance("SHA-256").digest(opt.getBytes()))).equals(hash);
          } catch (Exception e) {
            return false;
          }
        }).findFirst().orElse(null);
  }

  private static Stream<String> permutations(String s) {
    return s.isEmpty() ? Stream.of(s) : range(0, s.length()).boxed().flatMap(i -> permutations(s.substring(0, i) + s.substring(i + 1)).map(x -> s.charAt(i) + x));
  }
}