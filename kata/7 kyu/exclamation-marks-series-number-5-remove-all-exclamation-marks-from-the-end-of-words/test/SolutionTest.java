import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testBasic() {
    assertEquals("nothing to do", R.removeBang("nothing to do"));
    assertEquals("should remove bangs from the end of words", "No seriously Seriously Wow", R.removeBang("No seriously! Seriously!! Wow"));
    assertEquals("should remove bangs from the end of words only", "!!No seriously !Seriously !!Wow", R.removeBang("!!No! seriously! !Seriously!! !!Wow!"));
  }
}