import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComposingTest {
  @Test
  public void test() {
    assertEquals("bNkTB\nhTrWO\nRTFVi\nCnnIj", Composing.compose("byGt\nhTts\nRTFF\nCnnI", "jIRl\nViBu\nrWOb\nNkTB"));
    assertEquals("HgYPW\nTGGbM\nIPhqt\nuUMDH", Composing.compose("HXxA\nTGBf\nIPhg\nuUMD", "Hcbj\nqteH\nGbMJ\ngYPW"));
    assertEquals("tzlYf\nOOmYF\nsqPEZ\nxMkBh", Composing.compose("tSrJ\nOONy\nsqPF\nxMkB", "hLqw\nEZuh\nmYFl\nzlYf"));
  }
}
