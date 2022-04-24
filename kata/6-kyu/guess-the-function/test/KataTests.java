import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertEquals("e7248fce8990089e402b00f89dc8d14d", Kata.f(""));
    assertEquals("07b432d25170b469b57095ca269bc202", Kata.f("123"));
    assertEquals("9d986675f0edbed1494f279eb74620e3", Kata.f("@#$%!"));
    assertEquals("335ea833e623b5e8e8176ed06d4a97a1", Kata.f("example"));
    assertEquals("93897493c4b060acb45ad0bed6553dc6", Kata.f("Hello, world!"));
    assertEquals("41c5843d59073188fd03ce806c8e7f40", Kata.f(".YlKP9g6=<)]Zd/(iT'?i:,B&,"));

    assertEquals("", Kata.f("√16 = 4"));
    assertEquals("", Kata.f("Hello, мир!"));
    assertEquals("", Kata.f("Привет, мир!"));
    assertEquals("", Kata.f("test string\n"));
  }
}