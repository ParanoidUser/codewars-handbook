import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals("Fund4m3nt41s", Nerd.nerdify("Fund4m3nt41s"));
    assertEquals("S3v3n", Nerd.nerdify("Seven"));
    assertEquals("Los 4ng313s", Nerd.nerdify("Los Angeles"));
    assertEquals("S3oijs314wuu3", Nerd.nerdify("Seoijselawuue"));
  }
}
