import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PeopleTest {

  @Test
  public void testSample() {
    People person =
        People.builder()
            .name("Adam")
            .lastName("Savage")
            .age(25)
            .city("San Francisco")
            .job("Unchained Reaction")
            .build();
    assertEquals("Adam", person.getName());
    assertEquals("hello my name is Adam", person.greet());
  }
}
