import static java.util.stream.IntStream.rangeClosed;

class FindDivisor {
  long numberOfDivisors(int n) {
    return rangeClosed(1, n).filter(i -> n % i == 0).count();
  }
}
