import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void test() {
    assertEquals("Man pak I pak need pak a pak taxi pak up pak to pak Ubud", Kata.pak("Man I need a taxi up to Ubud"));
    assertEquals("What pak time pak are pak we pak climbing pak up pak the pak volcano?", Kata.pak("What time are we climbing up the volcano?"));
    assertEquals("Take pak me pak to pak Semynak!", Kata.pak("Take me to Semynak!"));
  }
}
