package com.codewars.javatlacati.exceptions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;
import org.junit.jupiter.api.Test;

class ExceptionsPuzzleTest {
  @Test
  void sample() {
    assertThrows(SQLException.class, ExceptionsPuzzle::callMe);
  }
}