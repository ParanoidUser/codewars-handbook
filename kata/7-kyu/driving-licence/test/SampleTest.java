import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals("SMITH001010JJ9AA", Solution.driver(new String[] {"John", "James", "Smith", "01-Jan-2000", "M"}));
    assertEquals("GIBBS862131J99AA", Solution.driver(new String[] {"Johanna", "", "Gibbs", "13-Dec-1981", "F"}));
    assertEquals("LEE99809021AR9AA", Solution.driver(new String[] {"Andrew", "Robert", "Lee", "02-September-1981", "M"}));
  }
}
