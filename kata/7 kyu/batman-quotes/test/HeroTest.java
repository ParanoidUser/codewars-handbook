import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeroTest {
  static String[] quotes = {
    "WHERE IS SHE?!", "Holy haberdashery, Batman!", "Let's put a smile on that faaaceee!"
  };

  @Test
  public void test1() {
    assertEquals(
        "Fail", "Robin: Holy haberdashery, Batman!", BatmanQuotes.getQuote(quotes, "Rob1n"));
  }

  @Test
  public void test2() {
    assertEquals("Fail", "Batman: WHERE IS SHE?!", BatmanQuotes.getQuote(quotes, "Batm0n"));
  }

  @Test
  public void test3() {
    assertEquals(
        "Fail",
        "Joker: Let's put a smile on that faaaceee!",
        BatmanQuotes.getQuote(quotes, "Jok2r"));
  }
}
