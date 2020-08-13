import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Fund4m3nt41s", Nerd.nerdify("Fund4m3nt41s"));
    assertEquals("S3v3n", Nerd.nerdify("Seven"));
    assertEquals("Los 4ng313s", Nerd.nerdify("Los Angeles"));
    assertEquals("S3oijs314wuu3", Nerd.nerdify("Seoijselawuue"));
  }
}
