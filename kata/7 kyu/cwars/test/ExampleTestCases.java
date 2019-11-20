import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTestCases {
  @Test
  public void testExamples() {
    assertEquals("C.Wars", CWars.initials("code wars"));
    assertEquals("B.H.Obama", CWars.initials("Barack hussain obama"));
    assertEquals("B.H.Obama", CWars.initials("barrack hussain Obama"));
  }
}
