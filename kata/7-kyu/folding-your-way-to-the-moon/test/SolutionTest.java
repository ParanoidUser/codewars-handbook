import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void sampleTests() {
    assertEquals((Long) 42L, PaperFolder.fold(384000000.0));
    assertEquals((Long) 0L, PaperFolder.fold(0.00005));
  }
}
