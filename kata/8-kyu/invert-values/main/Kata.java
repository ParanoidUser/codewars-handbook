import static java.util.Arrays.stream;

class Kata {
  static int[] invert(int[] array) {
    return stream(array).map(i -> -i).toArray();
  }
}
