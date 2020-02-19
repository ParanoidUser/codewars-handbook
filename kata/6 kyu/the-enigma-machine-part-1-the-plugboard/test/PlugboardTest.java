import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlugboardTest {
  @Test
  public void testValidPlugboard() throws InvalidPlugboardWiresException {
    Plugboard plugboard = new Plugboard("AB");
    assertEquals("B", plugboard.process("A"));
    assertEquals("A", plugboard.process("B"));
    assertEquals("C", plugboard.process("C"));
    assertEquals(".", plugboard.process("."));
  }

  @Test(expected = InvalidPlugboardWiresException.class)
  public void testInvalidPlugboard1() throws InvalidPlugboardWiresException {
    new Plugboard("ABC");
  }

  @Test(expected = InvalidPlugboardWiresException.class)
  public void testInvalidPlugboard2() throws InvalidPlugboardWiresException {
    new Plugboard("ABAD");
  }

  @Test(expected = InvalidPlugboardWiresException.class)
  public void testInvalidPlugboard3() throws InvalidPlugboardWiresException {
    new Plugboard("ABCDEFGHIJKLMNOPQRSTUV");
  }
}
