import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class DeltaBitsTest {
  @Test
  public void test() {
    assertThat(DeltaBits.convertBits(31, 14), is(2));
  }
}
