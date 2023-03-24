import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SecretRecoveryTest {
  @Test
  void sample() {
    assertEquals("whatisup", new SecretDetective().recoverSecret(new char[][]{
        {'t', 'u', 'p'},
        {'w', 'h', 'i'},
        {'t', 's', 'u'},
        {'a', 't', 's'},
        {'h', 'a', 'p'},
        {'t', 'i', 's'},
        {'w', 'h', 's'}
    }));
  }
}