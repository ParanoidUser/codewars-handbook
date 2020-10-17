import static java.security.MessageDigest.getInstance;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.UnaryOperator;

interface Solution extends Iterator<String> {

  UnaryOperator<String> SHA1 = s -> {
    try {
      return new BigInteger(1, getInstance("SHA-1").digest(s.getBytes())).toString(16);
    } catch (Exception fatal) {
      throw new IllegalStateException(fatal);
    }
  };

  Map<String, String> CACHE = new HashMap<>(Map.of("da39a3ee5e6b4b0d3255bfef95601890afd80709", ""));
  Solution PASGEN = () -> true;
  int[] STATE = new int[2];

  default String next() {
    var guess = new StringBuilder();
    for (int i = STATE[0]++, l = STATE[1], m; l >= 0; l--, i %= m) {
      guess.append((char) (i / (m = (int) Math.pow(26, l)) + 'a'));
    }

    if (STATE[0] > Math.pow(26, STATE[1] + 1.)) {
      STATE[0] = 0;
      STATE[1]++;
    }
    return guess.toString();
  }

  static String passwordCracker(String hash) {
    String guess = CACHE.get(hash);
    for (String sha1 = ""; guess == null || !(sha1 = SHA1.apply(guess)).equals(hash);
        guess = PASGEN.next()) {
      CACHE.put(sha1, guess);
    }
    return guess;
  }
}