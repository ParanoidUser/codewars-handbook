import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
  @Test
  public void sampleTests() {
    assertEquals("hell wrld", Kata.removeO("hello world"));
    assertEquals("bn", Kata.removeO("bono"));
    assertEquals("hw are yu tday?", Kata.removeO("how are you today?"));
  }
}
