import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PCTest {

  @Test
  public void sampleTests() {
    assertEquals("CPU, GPU, desktopCase.", Kata.partsLeft(false, true, true, false, true, true, false, true));
    assertEquals("Your PC is ready to build!", Kata.partsLeft(true, true, true, true, true, true, true, true));
    assertEquals("No items bought!", Kata.partsLeft(false, false, false, false, false, false, false, false));
  }
}