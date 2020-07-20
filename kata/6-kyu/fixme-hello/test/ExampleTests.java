import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("Hello. My name is Batman.", new Dinglemouse().setName("Batman").hello());
    assertEquals("Hello. My name is Alice. I am female.", new Dinglemouse().setName("Alice").setSex('F').hello());
    assertEquals("Hello. My name is Bob. I am 27. I am male.", new Dinglemouse().setName("Bob").setAge(27).setSex('M').hello());
    assertEquals("Hello. I am 27. I am male. My name is Bob.", new Dinglemouse().setAge(27).setSex('M').setName("Bob").hello());
  }
}
