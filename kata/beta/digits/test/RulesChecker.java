import static java.util.stream.IntStream.of;

import java.util.concurrent.ThreadLocalRandom;

class RulesChecker implements Checker {
  static RulesChecker with(int... code) {
    return new RulesChecker(15, code);
  }

  private final int[] secret;
  private int maxAttempts;

  private RulesChecker(int maxAttempts, int[] code) {
    this.maxAttempts = maxAttempts;
    // shuffle
    secret = ThreadLocalRandom.current().ints().limit(2L * code.length).toArray();
    secret[0] = code[3] + secret[3];
    secret[2] = secret[4] - code[0];
    secret[5] = secret[6] + code[0] + code[1] + code[2] + code[3];
    secret[7] = secret[2] % secret[1] - code[2];
  }

  @Override
  public int check(int[] guess) {
    if (--maxAttempts < 0) {
      throw new IllegalArgumentException("Check limit exceeded");
    }
    if (of(guess).filter(i -> i >= 0 && i < 10).count() != secret.length / 2) {
      return 0;
    }

    // recover
    int[] code = new int[secret.length / 2];
    code[0] = secret[4] - secret[2];
    code[2] = secret[2] % secret[1] - secret[7];
    code[3] = secret[0] - secret[3];
    code[1] = secret[5] - secret[6] - code[0] - code[2] - code[3];

    int matched = 0;
    for (int i = 0; i < code.length; i++) {
      if (guess[i] == code[i]) {
        matched++;
      }
    }
    return matched;
  }
}