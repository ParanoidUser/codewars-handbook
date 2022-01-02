package preload;

import static java.util.concurrent.ThreadLocalRandom.current;

public interface Preload {
  static int oneTwo() {
    return current().nextInt(2) + 1;
  }
}
