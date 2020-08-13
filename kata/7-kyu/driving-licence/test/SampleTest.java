import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("SMITH001010JJ9AA", Solution.driver(new String[]{"John", "James", "Smith", "01-Jan-2000", "M"}));
    assertEquals("GIBBS862131J99AA", Solution.driver(new String[]{"Johanna", "", "Gibbs", "13-Dec-1981", "F"}));
    assertEquals("STEVE311242HA9AA", Solution.driver(new String[]{"Hurst", "Andrew", "Stevens", "24-November-1932", "M"}));
    assertEquals("LEE99809021AR9AA", Solution.driver(new String[]{"Andrew", "Robert", "Lee", "02-September-1981", "M"}));
  }
}
