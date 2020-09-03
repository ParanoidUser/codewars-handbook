import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TwoToOneTest {
  @Test
  void sample() {
    assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
    assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
  }
}
