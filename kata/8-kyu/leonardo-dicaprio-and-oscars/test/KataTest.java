import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void oscar88() {
    assertEquals("Leo finally won the oscar! Leo is happy", Kata.leo(88));
  }

  @Test
  public void oscar86() {
    assertEquals("Not even for Wolf of wallstreet?!", Kata.leo(86));
  }

  @Test
  public void below88() {
    assertEquals("When will you give Leo an Oscar?", Kata.leo(87));
    assertEquals("When will you give Leo an Oscar?", Kata.leo(83));
    assertEquals("When will you give Leo an Oscar?", Kata.leo(85));
  }

  @Test
  public void over88() {
    assertEquals("Leo got one already!", Kata.leo(89));
    assertEquals("Leo got one already!", Kata.leo(90));
    assertEquals("Leo got one already!", Kata.leo(95));
  }
}
