import static java.util.Arrays.stream;
import static java.util.stream.IntStream.rangeClosed;

class Representation {
  int daysRepresented(int[][] trips) {
    return (int) stream(trips).flatMapToInt(t -> rangeClosed(t[0], t[1])).distinct().count();
  }
}
