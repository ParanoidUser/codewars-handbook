import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void exampleTests() {
    assertEquals(" \t\n", Kata.whitespaceNumber(1));
    assertEquals(" \n", Kata.whitespaceNumber(0));
    assertEquals("\t\t\n", Kata.whitespaceNumber(-1));
    assertEquals(" \t \n", Kata.whitespaceNumber(2));
    assertEquals("\t\t\t\n", Kata.whitespaceNumber(-3));
  }
}
