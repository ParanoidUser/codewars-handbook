package com.codewars.anter69;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class MyLanguagesTest {
  @Test
  void sample() {
    assertEquals(List.of("Ruby", "Python"), MyLanguages.myLanguages(Map.of("Java", 10, "Ruby", 80, "Python", 65)));
    assertEquals(List.of("Dutch", "Greek", "Hindi"), MyLanguages.myLanguages(Map.of("Hindi", 60, "Dutch", 93, "Greek", 71)));
    assertEquals(List.of(), MyLanguages.myLanguages(Map.of("C++", 50, "ASM", 10, "Haskell", 20)));
  }
}
