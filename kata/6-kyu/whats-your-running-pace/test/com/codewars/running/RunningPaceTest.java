package com.codewars.running;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RunningPaceTest {
  @CsvSource(textBlock = """
           4:16,   2.51,  10:43
          55:06,    1.0,  55:06
         902:40,    0.2, 180:32
           3:15,      1,   3:15
           5:00,      5,  25:00
           5:00,     15,  75:00
           4:16,   2.51,  10:43
           4:30,   4.99,  22:32
           3:10,    0.2,   0:38
           2:54, 42.195, 122:57
      """)
  @ParameterizedTest
  void sample(String expected, String distance, String runDuration) {
    assertEquals(expected, RunningPace.calculate(Double.parseDouble(distance), runDuration));
  }
}
