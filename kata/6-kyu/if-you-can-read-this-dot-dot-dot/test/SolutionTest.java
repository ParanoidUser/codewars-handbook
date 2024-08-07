import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(delimiter = '|', textBlock = """
      If you can read | India Foxtrot Yankee Oscar Uniform Charlie Alfa November Romeo Echo Alfa Delta
      Did not see that coming | Delta India Delta November Oscar Tango Sierra Echo Echo Tango Hotel Alfa Tango Charlie Oscar Mike India November Golf
      go for it! | Golf Oscar Foxtrot Oscar Romeo India Tango !
      the five boxing wizards jump quickly. | Tango Hotel Echo Foxtrot India Victor Echo Bravo Oscar Xray India November Golf Whiskey India Zulu Alfa Romeo Delta Sierra Juliett Uniform Mike Papa Quebec Uniform India Charlie Kilo Lima Yankee .
      PACK MY BOX WITH FIVE DOZEN LIQUOR JUGS? | Papa Alfa Charlie Kilo Mike Yankee Bravo Oscar Xray Whiskey India Tango Hotel Foxtrot India Victor Echo Delta Oscar Zulu Echo November Lima India Quebec Uniform Oscar Romeo Juliett Uniform Golf Sierra ?
        p ? u . n  c t u  , a t i o n  ! | Papa ? Uniform . November Charlie Tango Uniform , Alfa Tango India Oscar November !
      """)
  void sample(String input, String expected) {
    assertEquals(expected, Kata.toNATO(input));
  }
}