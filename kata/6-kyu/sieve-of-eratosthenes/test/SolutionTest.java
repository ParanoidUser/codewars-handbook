import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(List.of(), Primes.primes(0));
    assertEquals(List.of(), Primes.primes(1));
    assertEquals(List.of(2, 3), Primes.primes(3));
    assertEquals(List.of(2, 3, 5), Primes.primes(6));
    assertEquals(List.of(2, 3, 5, 7), Primes.primes(7));
    assertEquals(List.of(2, 3, 5, 7, 11), Primes.primes(11));
    assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113), Primes.primes(120));
  }
}