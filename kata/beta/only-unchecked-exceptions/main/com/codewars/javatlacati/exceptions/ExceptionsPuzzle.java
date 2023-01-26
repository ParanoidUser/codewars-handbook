package com.codewars.javatlacati.exceptions;

import java.sql.SQLException;

interface ExceptionsPuzzle {
  static void callMe() {
    doThrow(new SQLException());
  }

  private static <E extends Throwable> void doThrow(Exception e) throws E {
    throw (E) e;
  }
}