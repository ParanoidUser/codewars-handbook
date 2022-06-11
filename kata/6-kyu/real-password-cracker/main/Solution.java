import static java.security.MessageDigest.getInstance;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.UnaryOperator;

interface Solution extends Iterator<String> {
  default String next() {
    var guess = new StringBuilder();
    int m;
    for (int i = Util.CHAR_CODE.getAndIncrement(), l = Util.CHAR_LEVEL.get(); l >= 0; l--, i %= m) {
      m = (int) Math.pow(26, l);
      guess.append((char) (i / m + 'a'));
    }

    if (Util.CHAR_CODE.get() > Math.pow(26, Util.CHAR_LEVEL.get() + 1.)) {
      Util.CHAR_CODE.set(0);
      Util.CHAR_LEVEL.incrementAndGet();
    }
    return guess.toString();
  }

  static String passwordCracker(String hash) {
    var guess = Util.CACHE.get(hash);
    var sha1 = "";
    while (guess == null || !(sha1 = Util.SHA1.apply(guess)).equals(hash)) {
      Util.CACHE.put(sha1, guess);
      guess = Util.INSTANCE.next();
    }
    return guess;
  }

  class Util {
    private Util() {}

    private static final Solution INSTANCE = () -> true;
    private static final AtomicInteger CHAR_CODE = new AtomicInteger();
    private static final AtomicInteger CHAR_LEVEL = new AtomicInteger();
    private static final Map<String, String> CACHE = new HashMap<>(Map.of("da39a3ee5e6b4b0d3255bfef95601890afd80709", ""));
    private static final UnaryOperator<String> SHA1 = s -> {
      try {
        return new BigInteger(1, getInstance("SHA-1").digest(s.getBytes())).toString(16);
      } catch (Exception fatal) {
        throw new IllegalStateException(fatal);
      }
    };
  }
}