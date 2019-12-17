import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals(16, SimpleStringDivision.solve("1 2 36 4 8", 2));
    assertEquals(8, SimpleStringDivision.solve("1 2 36 4 8", 3));
    assertEquals(11, SimpleStringDivision.solve("1 2 36 4 8", 4));
    assertEquals(4, SimpleStringDivision.solve("1 2 36 4 8", 8));
  }

  @Test
  public void sampleTests() {
    assertEquals(6, SimpleStringDivision.solve("1 3 6 3", 3));
  }
}
