import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void exampleTest1() {
    assertArrayEquals(new String[] {"head", "body", "tail"}, WrongEndHead.fixTheMeerkat(new String[] {"tail", "body", "head"}));
  }

  @Test
  public void exampleTest2() {
    assertArrayEquals(new String[] {"heads", "body", "tails"}, WrongEndHead.fixTheMeerkat(new String[] {"tails", "body", "heads"}));
  }

  @Test
  public void exampleTest3() {
    assertArrayEquals(new String[] {"top", "middle", "bottom"}, WrongEndHead.fixTheMeerkat(new String[] {"bottom", "middle", "top"}));
  }

  @Test
  public void exampleTest4() {
    assertArrayEquals(new String[] {"upper legs", "torso", "lower legs"}, WrongEndHead.fixTheMeerkat(new String[] {"lower legs", "torso", "upper legs"}));
  }

  @Test
  public void exampleTest5() {
    assertArrayEquals(new String[] {"sky", "rainbow", "ground"}, WrongEndHead.fixTheMeerkat(new String[] {"ground", "rainbow", "sky"}));
  }
}
