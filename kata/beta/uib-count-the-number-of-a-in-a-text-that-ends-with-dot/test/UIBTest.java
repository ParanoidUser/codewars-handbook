import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UIBTest {
  @BeforeEach
  void setUp() throws Exception {
    System.reset();
  }

  @Test
  void test() throws Exception {
    System.write("codewars.");
    UIB.countAs();
    assertEquals("This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 1 'a'.\n", System.read());
  }

  @Test
  void test2() throws Exception {
    System.write("there is nothing like home.");
    UIB.countAs();
    assertEquals("This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 0 'a'.\n", System.read());
  }

  @Test
  void test3() throws Exception {
    System.write("hello how are you i am fine what about you.");
    UIB.countAs();
    assertEquals("This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 4 'a'.\n", System.read());
  }

  @Test
  void test4() throws Exception {
    System.write(".");
    UIB.countAs();
    assertEquals("This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 0 'a'.\n", System.read());
  }

  @Test
  void test5() throws Exception {
    System.write("three rings for the elven kings under the sky, seven for the dwarf lords in their halls of stone, nine for the mortal men doomed to die, one for the dark lord on his dark throne, in the land of mordor where the shadows lie one ring to rule them all, one ring to find them, one ring the bring them all, and in the darkness bind them in the land of mordor where the shadows lie.");
    UIB.countAs();
    assertEquals("This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 13 'a'.\n", System.read());
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
}
