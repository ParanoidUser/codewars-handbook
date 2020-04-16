package com.codewars.anter69;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MyLanguagesTest {
  @Test
  public void basicTests() {
    var map1 = Map.of("Java", 10, "Ruby", 80, "Python", 65);
    assertEquals(Arrays.asList("Ruby", "Python"), MyLanguages.myLanguages(map1));

    var map2 = Map.of("Hindi", 60, "Dutch", 93, "Greek", 71);
    assertEquals(Arrays.asList("Dutch", "Greek", "Hindi"), MyLanguages.myLanguages(map2));

    var map3 = Map.of("C++", 50, "ASM", 10, "Haskell", 20);
    assertEquals(Collections.emptyList(), MyLanguages.myLanguages(map3));
  }
}
