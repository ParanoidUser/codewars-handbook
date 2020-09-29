import static java.util.UUID.randomUUID;
import static java.util.function.Predicate.not;
import static java.util.stream.Stream.generate;

interface Solution {
  static String generateName(PhotoManager manager) {
    return generate(() -> randomUUID().toString().substring(30)).filter(not(manager::nameExists)).findFirst().orElse("");
  }
}