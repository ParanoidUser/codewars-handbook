import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExampleTests {
  @ParameterizedTest
  @CsvSource(textBlock = """
      freind, friend
      friend, friend
      recieve, receive
      feireist, fieriest
      sciencier, sceinceir
      deities, dieties
      eeiie, iieee
      cieee, ceeei
      eiicieeceie, iieceeiceei
      """)
  void sample(String word, String expected) {
    assertEquals(expected, Solution.iBeforeE(word));
  }
}