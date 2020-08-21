import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CovfefeTest {
  @Test
  void sample() {
    assertEquals("covfefe", Covfefe.covfefe("coverage"));
    assertEquals("covfefe covfefe", Covfefe.covfefe("coverage coverage"));
    assertEquals("nothing covfefe", Covfefe.covfefe("nothing"));
    assertEquals("double space  covfefe", Covfefe.covfefe("double space "));
    assertEquals("covfefe covfefe", Covfefe.covfefe("covfefe"));
  }
}
