import static java.util.List.of;
import static java.util.concurrent.ThreadLocalRandom.current;

class Ghost {
  String getColor() {
    return of("white", "yellow", "purple", "red").get(current().nextInt(4));
  }
}
