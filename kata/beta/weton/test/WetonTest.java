import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WetonTest {
  @Test
  void sampleTest() {
    assertEquals("Jemuwah Legi", Weton.getWeton("1945-8-17"));
    assertEquals("Selasa Kliwon", Weton.getWeton("October 22, 2019"));
    assertEquals("Selasa Kliwon", Weton.getWeton("22 October 2019"));
    assertEquals("Rebo Wage", Weton.getWeton("10/11/1978"));
    assertEquals("Rebo Wage", Weton.getWeton("12/9/2020"));
  }
}