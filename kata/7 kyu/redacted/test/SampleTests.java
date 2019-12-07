import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SampleTests {
  @Test
  public void ex1() {
    String doc1 = "TOP SECRET:\nThe missile launch code for Sunday XXXXXXXXXX is:\nXXXXXXXXXXXXXXXXX";
    String doc2 = "TOP SECRET:\nThe missile launch code for Sunday 5th August is:\n7-ZERO-8X-ALPHA-1";
    assertTrue(Dinglemouse.redacted(doc1, doc2));
  }

  @Test
  public void ex2() {
    String doc1 = "The name of the mole is Professor XXXXX";
    String doc2 = "The name of the mole is Professor Dinglemouse";
    assertFalse(Dinglemouse.redacted(doc1, doc2));
  }

  @Test
  public void ex3() {
    String doc1 = "XXXXXXXX XXXXXXX XXXXXXXXXXXXXXXXXXX\nXXXX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX XXXXXXXXX XXXXXXXXXXXXX XXXXX";
    String doc2 = "Area-51. Medical Report. 23/Oct/1969\nE.T. subject 4 was given an asprin after reporting sick for duty today";
    assertTrue(Dinglemouse.redacted(doc1, doc2));
  }
}
