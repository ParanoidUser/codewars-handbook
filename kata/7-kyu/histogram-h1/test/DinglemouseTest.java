import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DinglemouseTest {
  @Test
  void sample() {
    assertEquals("6|##### 5\n" + "5|\n" + "4|# 1\n" + "3|########## 10\n" + "2|### 3\n" + "1|####### 7\n", Dinglemouse.histogram(new int[] {7, 3, 10, 1, 0, 5}));
  }
}
