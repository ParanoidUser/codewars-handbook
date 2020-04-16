import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTests {
  @Test
  public void testEnglish() {
    assertEquals(1, Dinglemouse.getNumber("one").intValue());
    assertEquals(2, Dinglemouse.getNumber("two").intValue());
    assertEquals(3, Dinglemouse.getNumber("three").intValue());
    assertEquals(4, Dinglemouse.getNumber("four").intValue());
  }

  @Test
  public void testJapanese() {
    assertEquals(1, Dinglemouse.getNumber("ichi").intValue());
    assertEquals(2, Dinglemouse.getNumber("ni").intValue());
    assertEquals(3, Dinglemouse.getNumber("san").intValue());
    assertEquals(4, Dinglemouse.getNumber("shi").intValue());
  }

  @Test
  public void testFrench() {
    assertEquals(1, Dinglemouse.getNumber("un").intValue());
    assertEquals(2, Dinglemouse.getNumber("deux").intValue());
    assertEquals(3, Dinglemouse.getNumber("trois").intValue());
    assertEquals(4, Dinglemouse.getNumber("quatre").intValue());
  }
}
