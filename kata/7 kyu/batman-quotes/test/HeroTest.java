import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeroTest {
  static String[] quotes = {
    "Quote Hidden in example test", "Holy haberdashery, Batman!", "Quote Hidden in example test"
  };

  @Test
  public void test1() {
    assertEquals("Fail", "Robin: Holy haberdashery, Batman!", BatmanQuotes.getQuote(quotes, "Rob1n"));
  }
}
