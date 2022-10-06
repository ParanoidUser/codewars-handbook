import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

class UIBTest {
  @BeforeEach
  void setUp() throws Exception {
    System.reset();
  }

  @ParameterizedTest
  @ArgumentsSource(TestData.class)
  void sample(String text, String expected) throws Exception {
    System.write(text);
    UIB.countAs();
    assertEquals(expected, System.read());
  }

  @Test
  void readNoContent() throws Exception {
    assertEquals("", System.read());
  }

  @Test
  void readSomeContent() throws Exception {
    System.out.println("1");
    System.out.println("2");
    System.out.println("3");
    assertEquals("1\n2\n3\n", System.read());
  }

  private static class TestData implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
      return Stream.of(
          Arguments.of(".", "This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 0 'a'.\n"),
          Arguments.of("codewars.", "This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 1 'a'.\n"),
          Arguments.of("there is nothing like home.", "This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 0 'a'.\n"),
          Arguments.of("hello how are you i am fine what about you.", "This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 4 'a'.\n"),
          Arguments.of("three rings for the elven kings under the sky, seven for the dwarf lords in their halls of stone, nine for the mortal men doomed to die, one for the dark lord on his dark throne, in the land of mordor where the shadows lie one ring to rule them all, one ring to find them, one ring the bring them all, and in the darkness bind them in the land of mordor where the shadows lie.", "This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 13 'a'.\n")
      );
    }
  }
}
