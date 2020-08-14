import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EightiesKids5Test {
  @Test
  void sample() {
    assertEquals("water", EightiesKids5.bucketOf("water"));
    assertEquals("slime", EightiesKids5.bucketOf("slime"));
    assertEquals("sludge", EightiesKids5.bucketOf("Will I get wet? I don't know."));
    assertEquals("air", EightiesKids5.bucketOf("This should be safe."));
  }
}
