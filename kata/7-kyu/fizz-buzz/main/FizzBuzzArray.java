import static java.util.stream.IntStream.rangeClosed;

interface FizzBuzzArray {
  static String[] fizzBuzz(int n) {
    return rangeClosed(1, n).mapToObj(i -> i % 15 < 1 ? "FizzBuzz" : i % 3 < 1 ? "Fizz" : i % 5 < 1 ? "Buzz" : i + "").toArray(String[]::new);
  }
}