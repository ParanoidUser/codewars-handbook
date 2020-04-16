import static java.util.stream.IntStream.rangeClosed;

class Kata {
  static boolean abundantNumber(int num) {
    return rangeClosed(1, num / 2).filter(i -> num % i == 0).sum() > num;
  }
}
