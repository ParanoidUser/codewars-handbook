import static java.util.stream.IntStream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final int[] results = new int[60000];
  private final Set<Integer> setResults = new HashSet<>();

  @BeforeEach
  void setUp() {
    for (int i = 0; i < results.length; i++) {
      results[i] = Main.oneTwoThree();
      setResults.add(results[i]);
    }
  }

  @Test
  void sample() {
    assertTrue(setResults.contains(1));
    assertTrue(setResults.contains(2));
    assertTrue(setResults.contains(3));

    assertEquals(3, setResults.size());
    assertEquals(0.333, of(results).filter(n -> n == 1).count() * 1. / results.length, 0.01);
    assertEquals(0.333, of(results).filter(n -> n == 2).count() * 1. / results.length, 0.01);
    assertEquals(0.333, of(results).filter(n -> n == 3).count() * 1. / results.length, 0.01);
  }
}
