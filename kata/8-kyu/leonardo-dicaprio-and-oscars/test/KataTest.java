import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals("Leo finally won the oscar! Leo is happy", Kata.leo(88));
    assertEquals("Not even for Wolf of wallstreet?!", Kata.leo(86));
    assertEquals("When will you give Leo an Oscar?", Kata.leo(87));
    assertEquals("When will you give Leo an Oscar?", Kata.leo(83));
    assertEquals("When will you give Leo an Oscar?", Kata.leo(85));
    assertEquals("Leo got one already!", Kata.leo(89));
    assertEquals("Leo got one already!", Kata.leo(90));
    assertEquals("Leo got one already!", Kata.leo(95));
  }
}
