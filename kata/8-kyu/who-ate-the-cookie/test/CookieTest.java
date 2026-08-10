import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CookieTest {
  @Test
  void sample() {
    assertEquals("Who ate the last cookie? It was Zach!", Cookie.cookie("Ryan"));
    assertEquals("Who ate the last cookie? It was Zach!", Cookie.cookie("Zach"));
    assertEquals("Who ate the last cookie? It was Zach!", Cookie.cookie("Monica"));
    assertEquals("Who ate the last cookie? It was Zach!", Cookie.cookie("true"));

    assertEquals("Who ate the last cookie? It was Monica!", Cookie.cookie(2));
    assertEquals("Who ate the last cookie? It was Monica!", Cookie.cookie(100));
    assertEquals("Who ate the last cookie? It was Monica!", Cookie.cookie(-2));
    assertEquals("Who ate the last cookie? It was Monica!", Cookie.cookie(2.5));

    assertEquals("Who ate the last cookie? It was the dog!", Cookie.cookie(true));
    assertEquals("Who ate the last cookie? It was the dog!", Cookie.cookie(false));
    assertEquals("Who ate the last cookie? It was the dog!", Cookie.cookie(new StringBuilder()));
  }
}