import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PasswordHiderTest {
  @Test
  void sample() {
    assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****", PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"));
    assertEquals("jdbc:google:mysql://127.0.0.1:2021/rh:eu?password=**********&user=nimda", PasswordHider.hidePasswordFromConnection("jdbc:google:mysql://127.0.0.1:2021/rh:eu?password=qwertyuiop&user=nimda"));
  }
}
