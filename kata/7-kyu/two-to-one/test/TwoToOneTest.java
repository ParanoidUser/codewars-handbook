import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoToOneTest {
  @Test
  public void test() {
    assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
    assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
  }
}
