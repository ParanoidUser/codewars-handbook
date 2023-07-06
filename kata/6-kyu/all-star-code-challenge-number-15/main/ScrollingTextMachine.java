import static java.util.stream.IntStream.rangeClosed;

class ScrollingTextMachine {
  String[] rotate(String text) {
    return rangeClosed(1, text.length())
            .mapToObj(i -> text.substring(i) + text.substring(0, i))
            .toArray(String[]::new);
  }
}