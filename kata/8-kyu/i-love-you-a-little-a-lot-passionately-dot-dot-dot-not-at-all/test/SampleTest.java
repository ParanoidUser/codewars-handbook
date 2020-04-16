import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void test1() {
    assertEquals("I love you", Sid.howMuchILoveYou(1));
    assertEquals("a little", Sid.howMuchILoveYou(2));
    assertEquals("not at all", Sid.howMuchILoveYou(6));
  }
}
