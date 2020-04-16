import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstNonRepeatedTest {
  @Test
  public void test1() {
    Character output = FirstNonRepeated.firstNonRepeated("test");
    assertEquals((Character) 'e', output);
  }

  @Test
  public void test2() {
    Character output = FirstNonRepeated.firstNonRepeated("teeter");
    assertEquals((Character) 'r', output);
  }

  @Test
  public void test3() {
    Character output = FirstNonRepeated.firstNonRepeated("1122321235121222");
    assertEquals((Character) '5', output);
  }
}
