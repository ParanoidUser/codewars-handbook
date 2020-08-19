import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HeroTest {
  @Test
  void sample() {
    String[] quotes = {"WHERE IS SHE?!", "Holy haberdashery, Batman!", "Let's put a smile on that faaaceee!"};
    assertEquals("Robin: Holy haberdashery, Batman!", BatmanQuotes.getQuote(quotes, "Rob1n"));
    assertEquals("Batman: WHERE IS SHE?!", BatmanQuotes.getQuote(quotes, "Batm0n"));
    assertEquals("Joker: Let's put a smile on that faaaceee!", BatmanQuotes.getQuote(quotes, "Jok2r"));
  }
}
