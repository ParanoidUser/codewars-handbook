import static org.junit.Assert.*;
import org.junit.Test;

public class UpdownTest {
  @Test
  public void test() {
    assertEquals("who RETAINING hit THAT a THE we TAKEN", Updown.arrange("who hit retaining The That a we taken"));
    assertEquals("i CAME on WERE up GRANDMOTHERS so", Updown.arrange("on I came up were so grandmothers"));
    assertEquals("way THE my WALL him THEM", Updown.arrange("way the my wall them him"));
    assertEquals("turn GREAT-AUNTS know AUNT a LOOK to BACK", Updown.arrange("turn know great-aunts aunt look A to back"));
  }
}
