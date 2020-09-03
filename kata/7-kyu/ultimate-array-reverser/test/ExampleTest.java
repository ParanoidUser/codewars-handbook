import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ExampleTest {
  @Test
  void sample() {
    assertArrayEquals(new String[] {"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"}, ArrayReverser.reverse(new String[] {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"}));
    assertArrayEquals(new String[] {"How", "many", "shrimp", "do", "you", "have", "to", "eat", "before", "your", "skin", "starts", "to", "turn", "pink?"}, ArrayReverser.reverse(new String[] {"?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH"}));
  }
}
