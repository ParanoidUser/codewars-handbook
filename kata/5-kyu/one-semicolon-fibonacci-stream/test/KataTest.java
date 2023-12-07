import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, Fibonacci.stream(0, 1).limit(10).toArray());
  }
}