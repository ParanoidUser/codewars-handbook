import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    assertEquals("0 0 0 0 0", Kata.sendMessage("     "));
    assertEquals("4433999", Kata.sendMessage("hey"));
    assertEquals("666 6633089666084477733 33", Kata.sendMessage("one two three"));
    assertEquals("#44#33555 5556660#9#66677755531111", Kata.sendMessage("Hello World!"));
    assertEquals("#3#33 3330#222#666 6601-1111", Kata.sendMessage("Def Con 1!"));
    assertEquals("#2**#9999", Kata.sendMessage("A-z"));
    assertEquals("1-9-8-4-", Kata.sendMessage("1984"));
    assertEquals("#22#444 4084426655777703336667770222443322255444664066688 806999055282", Kata.sendMessage("Big thanks for checking out my kata"));
    assertEquals("#3****#22*-22**4-*-2*-222", Kata.sendMessage("D=b*b-4*a*c"));
  }
}
