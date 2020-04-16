import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
  @Test
  public void test1() {
    assertEquals(1, Kata.TripleDouble(451999277L, 41177722899L));
  }

  @Test
  public void test2() {
    assertEquals(0, Kata.TripleDouble(1222345L, 12345L));
  }

  @Test
  public void test3() {
    assertEquals(0, Kata.TripleDouble(12345L, 12345L));
  }

  @Test
  public void test4() {
    assertEquals(1, Kata.TripleDouble(666789L, 12345667L));
  }

  @Test
  public void test5() {
    assertEquals(0, Kata.TripleDouble(451999277L, 411777228L));
  }

  @Test
  public void test6() {
    assertEquals(0, Kata.TripleDouble(1112L, 122L));
  }
}
