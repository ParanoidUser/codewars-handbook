import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConcatTest {
  @Test
  public void test() {
    assertEquals("test1test2", StringConcatenator.stringConcat("test1", "test2"));
  }
} 