import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class Tests {
  @Test
  public void test1() {
    assertEquals(List.of("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat"), Shiritori.theGame(List.of("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat")));
  }

  @Test
  public void test2() {
    assertEquals(List.of("dog", "goose"), Shiritori.theGame(List.of("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc")));
  }

  @Test
  public void test3() {
    assertEquals(List.of("dog", "goose", "elephant", "tiger"), Shiritori.theGame(List.of("dog", "goose", "elephant", "tiger", "cat", "rhino", "rhino", "orc")));
  }

  @Test
  public void TestEmpty() {
    assertEquals(List.of(), Shiritori.theGame(List.of()));
  }

  @Test
  public void TestEStrings() {
    assertEquals(List.of(), Shiritori.theGame(List.of("", "", "", "", "", "", "")));
  }

  @Test
  public void TestMidEStrings() {
    assertEquals(List.of("ab", "bc"), Shiritori.theGame(List.of("ab", "bc", "", "de", "", "", "")));
  }
}
