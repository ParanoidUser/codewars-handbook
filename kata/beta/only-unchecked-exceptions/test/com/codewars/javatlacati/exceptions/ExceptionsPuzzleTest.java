package com.codewars.javatlacati.exceptions;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;

import java.io.IOException;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;

class ExceptionsPuzzleTest {

  @Test
  void sample() {
    assertThrows(SQLException.class, ExceptionsPuzzle::callMe);
    assertThrows(IOException.class, () -> ExceptionsPuzzle.doThrow(new IOException()));

    try (var mock = mockStatic(ExceptionsPuzzle.class)) {
      mock.when(() -> ExceptionsPuzzle.doThrow(any(SQLException.class))).thenAnswer((nothing -> null));
      assertDoesNotThrow(ExceptionsPuzzle::callMe);
    }
  }
}