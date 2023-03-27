import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmartDogOwnerTest {
  @Test
  void sample() {
    assertEquals("a", SmartDogOwner.woofDecoder("Wofowof!"));
    assertEquals("a", SmartDogOwner.woofDecoder("WoofWoof!"));
    assertEquals("a", SmartDogOwner.woofDecoder("Shhhhwoof!"));
    assertEquals("a", SmartDogOwner.woofDecoder("Woofshhh! Shhh!"));
    assertEquals("a", SmartDogOwner.woofDecoder("khkhkhWbzzzzobzzzOghrrrrfseswsw!"));
    assertEquals("hi", SmartDogOwner.woofDecoder("Woof-woof-woof-woof-woof-woof-woof-woof! Woof-woof-woof-woof-woof-woof-woof-woof-woof!"));
    assertEquals("feedme", SmartDogOwner.woofDecoder("Woof-woof-woof-woof-woof-woof!Woof-woof-woof-woof-woof! Woof-woof-woof-woof-woof! Woof-woof-woof-woof! Woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof! Woof-woof-woof-woof-woof!"));
    assertEquals("just barking!", SmartDogOwner.woofDecoder("Woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof-woof!"));
    assertEquals("nothing to decode!", SmartDogOwner.woofDecoder("Shhhh!"));
  }
}