import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringTaskTest {
  @Test
  void sample() {
    assertEquals(".t.r", StringTask.perform("tour"));
    assertEquals(".c.d.w.r.s", StringTask.perform("Codewars"));
    assertEquals(".b.c.b", StringTask.perform("aBAcAba"));
  }
}
