import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals("bracadabra", SimpleLetterRemoval.solve("abracadabra", 1));
    assertEquals("brcadabra", SimpleLetterRemoval.solve("abracadabra", 2));
    assertEquals("rcdbr", SimpleLetterRemoval.solve("abracadabra", 6));
    assertEquals("rdr", SimpleLetterRemoval.solve("abracadabra", 8));
    assertEquals("", SimpleLetterRemoval.solve("abracadabra", 50));
  }
}
