import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidTeamsAndNamesTest {
  @Test
  public void sample_test_1() {
    String actual = ValidTeamsAndNames.validate("A:Stefan,Milica,Zvonimir,AndrewH:Richard");
    assertEquals("1:Stefan,Milica,Zvonimir,Andrew", actual);
  }

  @Test
  public void sample_test_2() {
    String actual = ValidTeamsAndNames.validate("W:John,John,John,JohnC:Danger,Man");
    assertEquals("2:John,John,John,John,Danger,Man", actual);
  }
}
