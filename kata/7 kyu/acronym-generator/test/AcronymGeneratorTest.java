import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class AcronymGeneratorTest {
  @Test
  public void testSimple() {
    assertThat(AcronymGenerator.createAcronym("Meyer", "Thomas"), is("TM"));
  }

  @Test
  public void testMultipleLastNames() {
    assertThat(AcronymGenerator.createAcronym("Meyer-Schmidt", "Paul"), is("PMS"));
  }

  @Test
  public void testMultipleFirstNamesWithBlank() {
    assertThat(AcronymGenerator.createAcronym("Mueller", "Jan Erich"), is("JEM"));
  }

  @Test
  public void testMultipleFirstNamesWithDash() {
    assertThat(AcronymGenerator.createAcronym("Schmidt", "Jan-Erich"), is("JES"));
  }

  @Test
  public void testVonName() {
    assertThat(AcronymGenerator.createAcronym("von Lahnstein", "Peter"), is("PvL"));
  }
}
