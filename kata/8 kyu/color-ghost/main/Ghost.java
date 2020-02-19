import static java.util.List.of;

import java.util.Random;

class Ghost {
  static String getColor() {
    return of("white", "yellow", "purple", "red").get(new Random().nextInt(4));
  }
}
