import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PlugboardTest {
  @Test
  void sample() throws InvalidPlugboardWiresException {
    Plugboard plugboard = new Plugboard("AB");
    assertEquals("B", plugboard.process("A"));
    assertEquals("A", plugboard.process("B"));
    assertEquals("C", plugboard.process("C"));
    assertEquals(".", plugboard.process("."));

    assertThrows(InvalidPlugboardWiresException.class, () -> new Plugboard("ABC"));
    assertThrows(InvalidPlugboardWiresException.class, () -> new Plugboard("ABAD"));
    assertThrows(InvalidPlugboardWiresException.class, () -> new Plugboard("ABCDEFGHIJKLMNOPQRSTUV"));
  }
}
