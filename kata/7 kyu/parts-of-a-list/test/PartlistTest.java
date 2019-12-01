import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PartlistTest {
  @Test
  public void test() {
    assertArrayEquals(new String[][] {{"cdIw", "tzIy xDu rThG"}, {"cdIw tzIy", "xDu rThG"}, {"cdIw tzIy xDu", "rThG"}}, Partlist.partlist(new String[] {"cdIw", "tzIy", "xDu", "rThG"}));
    assertArrayEquals(new String[][] {{"I", "wish I hadn't come"}, {"I wish", "I hadn't come"}, {"I wish I", "hadn't come"}, {"I wish I hadn't", "come"}}, Partlist.partlist(new String[] {"I", "wish", "I", "hadn't", "come"}));
    assertArrayEquals(new String[][] {{ "vJQ", "anj mQDq sOZ"}, {"vJQ anj", "mQDq sOZ"}, {"vJQ anj mQDq", "sOZ"}}, Partlist.partlist(new String[] {"vJQ", "anj", "mQDq", "sOZ"}));
  }
}