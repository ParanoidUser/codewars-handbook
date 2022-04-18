package com.codewars.anter69;

import java.util.List;
import java.util.Map;

interface MyLanguages {
  static List<String> myLanguages(Map<String, Integer> results) {
    return results.keySet().stream()
        .filter(l -> results.get(l) > 59)
        .sorted((a, b) -> results.get(b) - results.get(a))
        .toList();
  }
}
