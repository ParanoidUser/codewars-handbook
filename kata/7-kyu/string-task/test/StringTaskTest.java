import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringTaskTest {
  @Test
  public void perform() {
    assertEquals(".t.r", StringTask.perform("tour"));
    assertEquals(".c.d.w.r.s", StringTask.perform("Codewars"));
    assertEquals(".b.c.b", StringTask.perform("aBAcAba"));
  }
}
