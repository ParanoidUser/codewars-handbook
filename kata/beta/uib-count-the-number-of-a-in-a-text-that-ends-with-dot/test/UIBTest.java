import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UIBTest {
  @Test
  public void test() {
    System.write("codewars.");
    UIB.countAs();
    assertEquals("This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 1 'a'.\n", System.read());
  }

  @Test
  public void test2() {
    System.write("there is nothing like home.");
    UIB.countAs();
    assertEquals("This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 0 'a'.\n", System.read());
  }

  @Test
  public void test3() {
    System.write("hello how are you i am fine what about you.");
    UIB.countAs();
    assertEquals("This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 4 'a'.\n", System.read());
  }

  @Test
  public void test4() {
    System.write(".");
    UIB.countAs();
    assertEquals("This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 0 'a'.\n", System.read());
  }

  @Test
  public void test5() {
    System.write("three rings for the elven kings under the sky, seven for the dwarf lords in their halls of stone, nine for the mortal men doomed to die, one for the dark lord on his dark throne, in the land of mordor where the shadows lie one ring to rule them all, one ring to find them, one ring the bring them all, and in the darkness bind them in the land of mordor where the shadows lie.");
    UIB.countAs();
    assertEquals("This program counts the number of times the vowel 'a' appears.\nPlease type a sentence that ends with '.': There are 13 'a'.\n", System.read());
  }
}
