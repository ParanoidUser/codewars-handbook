import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExampleTest {
  @Test
  public void fixedTest1() {
    assertArrayEquals(new String[] {"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"},
        ArrayReverser.reverse(new String[] {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"}));
  }

  @Test
  public void fixedTest2() {
    assertArrayEquals(new String[] {"How", "many", "shrimp", "do", "you", "have", "to", "eat", "before", "your", "skin", "starts", "to", "turn", "pink?"},
        ArrayReverser.reverse(new String[] {"?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH"}));
  }
}
