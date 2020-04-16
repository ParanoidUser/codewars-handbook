import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToNumberTest {
  @Test
  public void test1() {
    assertEquals("stringToNumber(1234)", 1234, StringToNumber.stringToNumber("1234"));
  }

  @Test
  public void test2() {
    assertEquals("stringToNumber(605)", 605, StringToNumber.stringToNumber("605"));
  }

  @Test
  public void test3() {
    assertEquals("stringToNumber(1405)", 1405, StringToNumber.stringToNumber("1405"));
  }

  @Test
  public void test4() {
    assertEquals("stringToNumber(-7)", -7, StringToNumber.stringToNumber("-7"));
  }
}
