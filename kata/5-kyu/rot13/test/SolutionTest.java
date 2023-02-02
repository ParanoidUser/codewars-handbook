
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
          hello, uryyb
          HelloWorld, UryybJbeyq
          Hello World!, Uryyb Jbeyq!
          123@#!!#@  33, 123@#!!#@  33
          W3 ar3 in ye@r 2023$$$!äöü, J3 ne3 va lr@e 2023$$$!äöü
      """)
  void sample(String message, String expected) {
    assertEquals(expected, Solution.rot13(message));
  }
}