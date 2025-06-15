import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      13, drink toddy
      14, drink coke
      16, drink coke
      17, drink coke
      18, drink beer
      20, drink beer
      21, drink whisky
      30, drink whisky
      """)
  void sample(int age, String expected) {
    assertEquals(expected, Drinks.peopleWithAgeDrink(age));
  }
}