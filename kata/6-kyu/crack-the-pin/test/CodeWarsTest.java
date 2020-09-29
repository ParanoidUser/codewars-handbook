import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mockStatic;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;

class CodeWarsTest {
  @Test
  void sample() {
    assertEquals("12345", new CodeWars().crack("827ccb0eea8a706c4c34a16891f84e7b"));
    assertEquals("00078", new CodeWars().crack("86aa400b65433b608a9db30070ec60cd"));
  }

  @Test
  void negative() {
    try (var mock = mockStatic(MessageDigest.class)) {
     mock.when(() -> MessageDigest.getInstance("MD5")).thenThrow(NoSuchAlgorithmException.class);
      var instance = new CodeWars();
     assertThrows(IllegalStateException.class, () -> instance.crack("any"));
    }
  }
}