import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("nothing to do", R.removeBang("nothing to do"));
    assertEquals("No seriously Seriously Wow", R.removeBang("No seriously! Seriously!! Wow"));
    assertEquals("!!No seriously !Seriously !!Wow", R.removeBang("!!No! seriously! !Seriously!! !!Wow!"));
  }
}