import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class CatComparatorTest {
  @Test
  public void testSimpleCase() {
    Cat[] cats = new Cat[2];
    cats[0] = new Cat("Lily", 30);
    cats[1] = new Cat("Drake", 15);

    Arrays.sort(cats, new CatWeightComparator());

    assertEquals("Incorrect cat found at index 0", "Drake", cats[0].name);
    assertEquals("Incorrect cat found at index 1", "Lily", cats[1].name);
  }

  @Test
  public void testWithCatsOfTheSameWeight() {
    Cat[] cats = new Cat[4];
    cats[0] = new Cat("Lily", 30);
    cats[1] = new Cat("Drake", 15);
    cats[2] = new Cat("Tails", 10);
    cats[3] = new Cat("Chimbo", 10);

    Arrays.sort(cats, new CatWeightComparator());

    assertEquals("Incorrect cat found at index 0", "Tails", cats[0].name);
    assertEquals("Incorrect cat found at index 1", "Chimbo", cats[1].name);
    assertEquals("Incorrect cat found at index 2", "Drake", cats[2].name);
    assertEquals("Incorrect cat found at index 3", "Lily", cats[3].name);
  }

  @Test
  public void testWithCatOfNegativeWeight() {
    Cat[] cats = new Cat[2];
    cats[0] = new Cat("Void Kitty", -30);
    cats[1] = new Cat("Drake", 15);

    Arrays.sort(cats, new CatWeightComparator());

    assertEquals("Incorrect cat found at index 0", "Void Kitty", cats[0].name);
    assertEquals("Incorrect cat found at index 1", "Drake", cats[1].name);
  }

  @Test
  public void testWithRandomlyWeightedCats() {
    int length = 100;
    Cat[] cats1 = new Cat[length];
    Cat[] cats2 = new Cat[length];

    Random r = new Random();
    for (int i = 0; i < length; i++) {
      Cat c = new Cat(((Integer) i).toString(), r.nextDouble());
      cats1[i] = c;
      cats2[i] = c;
    }

    Arrays.sort(cats1, new CatWeightComparator());
    Arrays.sort(cats2, (cat1, cat2) -> (int) Math.signum(cat1.weight - cat2.weight));

    for (int i = 0; i < length; i++) {
      assertEquals("Cat at index " + i + " is different than expected.", cats2[i].name, cats1[i].name);
    }
  }
}
