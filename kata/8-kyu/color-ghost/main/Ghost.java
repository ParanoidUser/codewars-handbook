import static java.util.List.of;

import java.security.SecureRandom;

class Ghost {
  String getColor() {
    return of("white", "yellow", "purple", "red").get(new SecureRandom().nextInt(4));
  }
}
