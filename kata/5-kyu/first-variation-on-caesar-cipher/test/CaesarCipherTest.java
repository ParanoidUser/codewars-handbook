import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaesarCipherTest {
  @Test
  void sample() {
    String plain = "I should have known that you would have a perfect answer for me!!!";
    var cipher = List.of("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
    assertEquals(cipher, CaesarCipher.movingShift(plain, 1));
    assertEquals(plain, CaesarCipher.demovingShift(cipher, 1));
  }
}