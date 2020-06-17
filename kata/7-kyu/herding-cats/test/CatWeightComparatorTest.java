import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class CatWeightComparatorTest {
  @Test
  void testSimpleCase() {
    Cat[] cats = {
        new Cat("Lily", 30),
        new Cat("Drake", 15)
    };

    Arrays.sort(cats, new CatWeightComparator());
    assertEquals("Drake", cats[0].name);
    assertEquals("Lily", cats[1].name);
  }

  @Test
  void testWithCatsOfTheSameWeight() {
    Cat[] cats = {
        new Cat("Lily", 30),
        new Cat("Drake", 15),
        new Cat("Tails", 10),
        new Cat("Chimbo", 10)
    };

    Arrays.sort(cats, new CatWeightComparator());
    assertEquals("Tails", cats[0].name);
    assertEquals("Chimbo", cats[1].name);
    assertEquals("Drake", cats[2].name);
    assertEquals("Lily", cats[3].name);
  }

  @Test
  void testWithCatOfNegativeWeight() {
    Cat[] cats = {
        new Cat("Void Kitty", -30),
        new Cat("Drake", 15)
    };

    Arrays.sort(cats, new CatWeightComparator());
    assertEquals("Void Kitty", cats[0].name);
    assertEquals("Drake", cats[1].name);
  }
}
