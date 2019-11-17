import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void swap_1() {
    assertEquals("HEllOWOrld!", Kata.swap("HelloWorld!"));
  }

  @Test
  public void swap_2() {
    assertEquals("SUndAy", Kata.swap("Sunday"));
  }
}
