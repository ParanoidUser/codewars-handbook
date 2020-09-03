import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PeopleTest {
  @Test
  void sample() {
    People person = People.builder()
            .name("Adam")
            .lastName("Savage")
            .age(25)
            .city("San Francisco")
            .job("Unchained Reaction")
            .build();

    assertEquals("Adam", person.getName());
    assertEquals("Savage", person.getLastName());
    assertEquals(25, person.getAge());
    assertEquals("San Francisco", person.getCity());
    assertEquals("Unchained Reaction", person.getJob());
    assertEquals("hello my name is Adam", person.greet());
  }
}
