import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SpyGraduationExampleTests {
  @Test
  void sample() {
    assertEquals("Tandy", new SpyGraduation().decrypt("慔扡据慤批"));
    assertEquals("spy kit", new SpyGraduation().decrypt("䉳佰佹䴠䉫佩佴"));
    assertEquals("Tandy", new SpyGraduation().decrypt("乔佡\u206E䵤䅹"));
  }
}
