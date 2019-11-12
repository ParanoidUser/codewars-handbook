import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HowDoICompareTest {

  static final Object[][] tests = {
    {0, "nothing"},
    {123, "nothing"},
    {-1, "nothing"},
    {42, "everything"},
    {42 * 42, "everything squared"},
  };

  @Test
  public void test() {
    for (Object[] t : tests) assertEquals(t[1], HowDoICompare.whatIs((Integer) t[0]));
  }
}
