import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("1337", Kata.toLeetSpeak("LEET"));
    assertEquals("(0D3W@R$", Kata.toLeetSpeak("CODEWARS"));
    assertEquals("#3110 W0R1D", Kata.toLeetSpeak("HELLO WORLD"));
    assertEquals("6875;73UD3=82F0J^", Kata.toLeetSpeak("GBT5;7EUDE=B2F0J^"));
    assertEquals("10R3M !P$UM D010R $!7 @M37", Kata.toLeetSpeak("LOREM IPSUM DOLOR SIT AMET"));
    assertEquals("7#3 QU!(K 8R0WN F0X JUMP$ 0V3R 7#3 1@2Y D06", Kata.toLeetSpeak("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
  }
}
