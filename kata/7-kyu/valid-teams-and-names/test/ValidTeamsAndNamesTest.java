import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ValidTeamsAndNamesTest {
  @Test
  void sample() {
    assertEquals("1:Stefan,Milica,Zvonimir,Andrew", ValidTeamsAndNames.validate("A:Stefan,Milica,Zvonimir,AndrewH:Richard"));
    assertEquals("2:John,John,John,John,Danger,Man", ValidTeamsAndNames.validate("W:John,John,John,JohnC:Danger,Man"));
  }
}
