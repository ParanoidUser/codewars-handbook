import static java.util.stream.IntStream.of;

interface Kata {
  static int speedLimit(int speed, int[] signals) {
    return of(signals).reduce(0, (fine, sign) -> fine + (
        speed > sign + 29 ? 500 :
        speed > sign + 19 ? 250 :
        speed > sign +  9 ? 100 : 0));
  }
}