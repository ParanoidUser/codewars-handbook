import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordHiderTest {
  @Test
  public void hidePasswordFromConnection() {
    assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****",
        PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"));
  }
}
