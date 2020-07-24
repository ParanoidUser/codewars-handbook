package preload;

import java.util.Random;

public interface Preload {
  static int oneTwo() {
    return new Random().nextInt(2) + 1;
  }
}
