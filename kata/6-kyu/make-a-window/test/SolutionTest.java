import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("-----\n|.|.|\n|-+-|\n|.|.|\n-----", Solution.makeAWindow(1));
    assertEquals("---------\n|...|...|\n|...|...|\n|...|...|\n|---+---|\n|...|...|\n|...|...|\n|...|...|\n---------", Solution.makeAWindow(3));
  }
}
