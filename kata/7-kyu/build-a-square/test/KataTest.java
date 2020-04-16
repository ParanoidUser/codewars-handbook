import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void exampleTests() {
    assertEquals("+++\n+++\n+++", Kata.generateShape(3));
    assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", Kata.generateShape(5));
    assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", Kata.generateShape(8));
  }
}
