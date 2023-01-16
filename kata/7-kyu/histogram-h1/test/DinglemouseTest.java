import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DinglemouseTest {
  @Test
  void sample() {
    assertEquals("""
        6|##### 5
        5|
        4|# 1
        3|########## 10
        2|### 3
        1|####### 7
        """, Dinglemouse.histogram(new int[]{7, 3, 10, 1, 0, 5}));
  }
}