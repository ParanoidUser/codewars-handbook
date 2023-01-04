import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
                  '', e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855
        Hello World!, 7f83b1657ff1fc53b92dc18148a1d65dfc2d4b1fa3d677284addd200126d9069
            Codewars, aeb7c211fae7fff7546d87886a7d3ace8e9ebc30bb36062dfec7c92c78a3e1db
      """)
  void sample(String input, String expected) {
    assertEquals(expected, Kata.sha256(input));
  }
}