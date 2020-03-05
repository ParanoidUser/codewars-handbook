import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void testBob27Male() {
    Dinglemouse dm = new Dinglemouse().setName("Bob").setAge(27).setSex('M');
    String expected = "Hello. My name is Bob. I am 27. I am male.";
    assertEquals(expected, dm.hello());
  }

  @Test
  public void test27MaleBob() {
    Dinglemouse dm = new Dinglemouse().setAge(27).setSex('M').setName("Bob");
    String expected = "Hello. I am 27. I am male. My name is Bob.";
    assertEquals(expected, dm.hello());
  }

  @Test
  public void testAliceFemale() {
    Dinglemouse dm = new Dinglemouse().setName("Alice").setSex('F');
    String expected = "Hello. My name is Alice. I am female.";
    assertEquals(expected, dm.hello());
  }

  @Test
  public void testBatman() {
    Dinglemouse dm = new Dinglemouse().setName("Batman");
    String expected = "Hello. My name is Batman.";
    assertEquals(expected, dm.hello());
  }
}
