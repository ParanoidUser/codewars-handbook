package preload;

import java.util.Random;

public class Preload {
  private static final Random random = new Random();

  public static int oneTwo() {
    return random.nextInt(2) + 1;
  }
}
