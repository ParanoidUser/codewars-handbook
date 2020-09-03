import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConcatTest {
  @Test
  void sample() {
    assertEquals("test1test2", new StringConcatenator().stringConcat("test1", "test2"));
  }
} 