import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class PartlistTest {
  @Test
  void sample() {
    assertArrayEquals(new String[][]{{"vJQ", "anj mQDq sOZ"}, {"vJQ anj", "mQDq sOZ"}, {"vJQ anj mQDq", "sOZ"}}, Partlist.partlist(new String[]{"vJQ", "anj", "mQDq", "sOZ"}));
    assertArrayEquals(new String[][]{{"cdIw", "tzIy xDu rThG"}, {"cdIw tzIy", "xDu rThG"}, {"cdIw tzIy xDu", "rThG"}}, Partlist.partlist(new String[]{"cdIw", "tzIy", "xDu", "rThG"}));
    assertArrayEquals(new String[][]{{"I", "wish I hadn't come"}, {"I wish", "I hadn't come"}, {"I wish I", "hadn't come"}, {"I wish I hadn't", "come"}}, Partlist.partlist(new String[]{"I", "wish", "I", "hadn't", "come"}));
  }
}