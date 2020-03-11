import static java.util.stream.IntStream.of;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {
  private static final int[] results = new int[60000];
  private static final Set<Integer> setResults = new HashSet<>();

  @BeforeClass
  public static void beforeClass() {
    for (int i = 0; i < results.length; i++) {
      results[i] = Main.oneTwoThree();
      setResults.add(results[i]);
    }
  }

  @Test
  public void testOneTwoThreeMustBePresent() {
    assertTrue(setResults.contains(1));
    assertTrue(setResults.contains(2));
    assertTrue(setResults.contains(3));
  }

  @Test
  public void testShouldNotContainInvalidNumbers() {
    assertEquals(3, setResults.size());
  }

  @Test
  public void testAllNumbersMustBePresentsWithEqualProbability() {
    assertTrue(of(results).filter(n -> n == 1).count() * 1. / results.length - 1. / 3 < 0.005);
    assertTrue(of(results).filter(n -> n == 2).count() * 1. / results.length - 1. / 3 < 0.005);
    assertTrue(of(results).filter(n -> n == 3).count() * 1. / results.length - 1. / 3 < 0.005);
  }
}
