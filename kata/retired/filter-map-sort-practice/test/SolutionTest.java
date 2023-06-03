import static java.time.temporal.ChronoUnit.DAYS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;
import java.util.List;
import org.junit.jupiter.api.Test;


class SolutionTest {
  @Test
  void sample() {
    var now = Instant.now();
    var items = List.of(
        new Item("Red", now.minus(1, DAYS), Category.HAZARDOUS),
        new Item("Red", now.minus(2, DAYS), Category.OVERSIZED),
        new Item("Red", now.minus(3, DAYS), Category.HEAVY),
        new Item("Red", now.minus(4, DAYS), Category.FRAGILE),
        new Item("Red", now.minus(5, DAYS), Category.OBLONG),
        new Item("Blue", now.minus(6, DAYS), Category.HAZARDOUS),
        new Item("Red", now.minus(7, DAYS), Category.OVERSIZED),
        new Item("Blue", now.minus(8, DAYS), Category.HEAVY),
        new Item("Red", now.minus(9, DAYS), Category.FRAGILE),
        new Item("Blue", now.minus(0, DAYS), Category.OBLONG)
    );

    List<Item> results = Solution.solve(items);
    assertTrue(results.stream().allMatch(i -> "Red".equals(i.color)));
    assertTrue(results.stream().allMatch(i -> DAYS.between(i.created, now) < 7));

    assertEquals(5, results.size());
    assertEquals(Category.FRAGILE, results.get(0).category);
    assertEquals(Category.HAZARDOUS, results.get(1).category);
    assertEquals(Category.HEAVY, results.get(2).category);
    assertEquals(Category.OBLONG, results.get(3).category);
    assertEquals(Category.OVERSIZED, results.get(4).category);
  }
}