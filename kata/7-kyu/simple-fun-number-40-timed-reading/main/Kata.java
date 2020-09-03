import static java.util.Arrays.stream;

interface Kata {
  static int timedReading(int maxLength, String text) {
    return (int) stream(text.replaceAll("[^a-zA-Z ]", "").split(" "))
                         .filter(w -> w.length() <= maxLength && !w.isEmpty()).count();
  }
}
