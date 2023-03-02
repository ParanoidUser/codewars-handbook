package com.codewars.javatlacati.exceptions;

import java.sql.SQLException;

interface ExceptionsPuzzle {
  static <E extends Exception> void callMe() throws E {
    throw (E) new SQLException();
  }
}