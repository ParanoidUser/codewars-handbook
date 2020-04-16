import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeFactorizerTest {
  @Parameters
  public static Collection<?> data() {
    return Arrays.asList(new Object[][] {
          {13L, asMap(13, 1)},
          {24L, asMap(2, 3, 3, 1)},
          {343L, asMap(7, 3)}
        });
  }

  private static Map<Long, Integer> asMap(long...data) {
    HashMap<Long, Integer> result = new HashMap<>();
    for (int i = 0; i < data.length; i++) {
      result.put(data[i], (int) data[++i]);
    }
    return result;
  }

  @Parameter
  public long n;

  @Parameter(1)
  public Map<Long, Integer> factors;

  @Test
  public void test() {
    assertEquals(factors, PrimeFactorizer.factor(n));
  }
}
