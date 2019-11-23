import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DeltaBitsTest {
  @Test
  public void test() {
    assertThat(DeltaBits.convertBits(31, 14), is(2));
  }
}
