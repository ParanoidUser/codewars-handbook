import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(Solution.pairOfShoes(new Shoe[]{new Shoe(Foot.LEFT, 30), new Shoe(Foot.RIGHT, 30)}));
    assertTrue(Solution.pairOfShoes(new Shoe[]{new Shoe(Foot.LEFT, 30), new Shoe(Foot.RIGHT, 30), new Shoe(Foot.LEFT, 30), new Shoe(Foot.RIGHT, 30)}));
    assertTrue(Solution.pairOfShoes(new Shoe[]{new Shoe(Foot.LEFT, 30), new Shoe(Foot.RIGHT, 30), new Shoe(Foot.LEFT, 36), new Shoe(Foot.RIGHT, 36), new Shoe(Foot.LEFT, 42), new Shoe(Foot.RIGHT, 42)}));
    assertFalse(Solution.pairOfShoes(new Shoe[]{new Shoe(Foot.LEFT, 30), new Shoe(Foot.RIGHT, 31)}));
    assertFalse(Solution.pairOfShoes(new Shoe[]{new Shoe(Foot.LEFT, 31), new Shoe(Foot.RIGHT, 31), new Shoe(Foot.LEFT, 30), new Shoe(Foot.LEFT, 30)}));
    assertFalse(Solution.pairOfShoes(new Shoe[]{new Shoe(Foot.LEFT, 30), new Shoe(Foot.RIGHT, 30), new Shoe(Foot.LEFT, 30), new Shoe(Foot.RIGHT, 30), new Shoe(Foot.LEFT, 30), new Shoe(Foot.LEFT, 30)}));
  }
}