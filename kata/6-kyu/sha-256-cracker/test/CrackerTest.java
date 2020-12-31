import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mockStatic;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;

class CrackerTest {
  @Test
  void sample() {
    assertNull(Cracker.crackSha256("f58262c8005bb64b8f99ec6083faf050c502d099d9929ae37ffed2fe1bb954fb", "abc"));
    assertEquals("aQHGy", Cracker.crackSha256("04b1b3c15da247514f3d51b34ca41c0f7677994041c7cdae0b73dbab535d89fe", "GHQay"));
    assertEquals("GoOutside", Cracker.crackSha256("b8c49d81cb795985c007d78379e98613a4dfc824381be472238dbd2f974e37ae", "deGioOstu"));
  }

  @Test
  void negative() {
    try (var mock = mockStatic(MessageDigest.class)) {
      mock.when(() -> MessageDigest.getInstance("SHA-256")).thenThrow(NoSuchAlgorithmException.class);
      assertNull(Cracker.crackSha256("04b1b3c15da247514f3d51b34ca41c0f7677994041c7cdae0b73dbab535d89fe", "GHQay"));
    }
  }
}