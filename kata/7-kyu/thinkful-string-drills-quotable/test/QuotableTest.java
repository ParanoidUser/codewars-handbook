import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class QuotableTest {
  @ParameterizedTest
  @CsvSource(delimiter = '|', textBlock = """
         Grae | Practice makes perfect       | Grae said: "Practice makes perfect"
          Dan | Get back to work, Grae       | Dan said: "Get back to work, Grae"
         Alex | Ruby is great fun            | Alex said: "Ruby is great fun"
      Bethany | Yes, way more fun than R     | Bethany said: "Yes, way more fun than R"
      Darrell | What the heck is this thing? | Darrell said: "What the heck is this thing?"
      """)
  void sample(String n, String q, String expected) {
    assertEquals(expected, Kata.quotable(n, q));
  }
}