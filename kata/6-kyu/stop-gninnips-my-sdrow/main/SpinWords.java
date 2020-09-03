import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

class SpinWords {
  String spinWords(String sentence) {
    return of(sentence.split(" ")).map(w -> w.length() > 4 ? new StringBuilder(w).reverse().toString() : w).collect(joining(" "));
  }
}
