import static java.util.stream.Stream.iterate;

interface Kata {
  static Object[] removeEveryOther(Object[] arr) {
    return iterate(0, i -> i < arr.length, i -> i + 2).map(i -> arr[i]).toArray();
  }
}