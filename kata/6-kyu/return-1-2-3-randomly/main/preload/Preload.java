package preload;

import java.security.SecureRandom;

public interface Preload {
  static int oneTwo() {
    return new SecureRandom().nextInt(2) + 1;
  }
}
