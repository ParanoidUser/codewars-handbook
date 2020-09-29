import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mockStatic;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("cntsa", Solution.passwordCracker("5b73257145405422cb0a166fd0c6d761f32582e1"));
    assertEquals("chdmw", Solution.passwordCracker("fd1064cfda8033fdafd94c43c20adda2f165f3e4"));
    assertEquals("test", Solution.passwordCracker("a94a8fe5ccb19ba61c4c0873d391e987982fbbd3"));
    assertEquals("code", Solution.passwordCracker("e6fb06210fafc02fd7479ddbed2d042cc3a5155e"));
    assertEquals("zzz", Solution.passwordCracker("40fa37ec00c761c7dbb6ebdee6d4a260b922f5f4"));
    assertEquals("zz", Solution.passwordCracker("d7dacae2c968388960bf8970080a980ed5c5dcb7"));
  }

  @Test
  void negative() {
    try (var mock = mockStatic(MessageDigest.class)) {
      mock.when(() -> MessageDigest.getInstance("SHA-1")).thenThrow(NoSuchAlgorithmException.class);
      assertThrows(IllegalStateException.class, () -> Solution.passwordCracker("any"));
    }
  }
}
