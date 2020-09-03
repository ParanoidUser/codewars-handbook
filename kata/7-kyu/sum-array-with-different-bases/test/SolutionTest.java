import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4258, ArraySumminator.sumItUp(new BasedNumbers[] {new BasedNumbers("101", 16), new BasedNumbers("7640", 8), new BasedNumbers("1", 9)}));
    assertEquals(13, ArraySumminator.sumItUp(new BasedNumbers[] {new BasedNumbers("101", 2), new BasedNumbers("10", 8)}));
    assertEquals(2751, ArraySumminator.sumItUp(new BasedNumbers[] {new BasedNumbers("ABC", 16), new BasedNumbers("11", 2)}));
  }
}
