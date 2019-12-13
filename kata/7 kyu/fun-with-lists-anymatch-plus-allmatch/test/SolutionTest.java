import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.function.Predicate;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertFalse(Solution.anyMatch(null, b -> false));
    assertFalse(Solution.anyMatch(null, b -> true));
    assertFalse(Solution.anyMatch(Helpers.listFromArray(1, 2, 3), b -> false));
    assertTrue(Solution.anyMatch(Helpers.listFromArray(1, 2, 3), b -> true));

    assertTrue(Solution.allMatch(null, b -> false));
    assertTrue(Solution.allMatch(null, b -> true));
    assertFalse(Solution.allMatch(Helpers.listFromArray(1, 2, 3), b -> false));
    assertTrue(Solution.allMatch(Helpers.listFromArray(1, 2, 3), b -> true));
  }

  @Test
  public void arrayOfInts() {
    assertTrue(Solution.anyMatch(Helpers.listFromArray(1, 2, 3), x -> x <= 2));
    assertFalse(Solution.anyMatch(Helpers.listFromArray(1, 2, 3), x -> x == 4));
    assertTrue(Solution.allMatch(Helpers.listFromArray(1, 2, 3), x -> x <= 3));
    assertFalse(Solution.allMatch(Helpers.listFromArray(1, 2, 3), x -> x > 4));
  }

  @Test
  public void arrayOfStrings() {
    assertTrue(Solution.anyMatch(Helpers.listFromArray("aaa", "b", "abc"), x -> x.contains("a")));
    assertFalse(Solution.anyMatch(Helpers.listFromArray("aaa", "b", "abc"), x -> x.indexOf("b") == 3));
    assertTrue(Solution.allMatch(Helpers.listFromArray("aaa", "ab", "abc"), x -> x.contains("a")));
    assertFalse(Solution.allMatch(Helpers.listFromArray("aaa", "b", "abc"), x -> x.contains("b")));
  }

  @Test
  public void randomTests() {
    for (int i = 0; i < 100; i++) {
      Node<Integer> head = Helpers.listFromArray(Helpers.randomArray(Helpers.randomInt(20, 100)));
      var p = pred(i);

      boolean expected = anyMatchSol(head, p);
      assertEquals(expected, Solution.anyMatch(head, p));

      expected = allMatchSol(head, p);
      assertEquals(expected, Solution.allMatch(head, p));
    }
  }

  private static Predicate<Integer> pred(int i) {
    int rand = Helpers.randomInt(-100, 100);
    switch (i % 5) {
      case 0:
        return x -> x < rand;
      case 1:
        return x -> x > rand;
      case 2:
        return x -> x <= rand;
      case 3:
        return x -> x >= rand;
      case 4:
        return x -> x == rand;
      default:
        return b -> true;
    }
  }

  private static <T> boolean anyMatchSol(Node<T> head, Predicate<T> p) {
    for (; head != null; head = head.next) {
      if (p.test(head.data)) return true;
    }
    return false;
  }

  private static <T> boolean allMatchSol(Node<T> head, Predicate<T> p) {
    return !anyMatchSol(head, p.negate());
  }
}
