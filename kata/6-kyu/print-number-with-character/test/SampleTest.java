import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("""
            $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
            $                                      $
            $   $$$$   $$$$   $$$$   $$$$   $$$$   $
            $  $$  $$ $$  $$ $$  $$ $$  $$ $$  $$  $
            $  $$  $$ $$  $$ $$  $$ $$  $$ $$  $$  $
            $  $$  $$ $$  $$ $$  $$  $$$$   $$$$   $
            $  $$  $$ $$  $$ $$  $$   $$     $$    $
            $   $$$$   $$$$   $$$$   $$     $$     $
            $                                      $
            $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$""",
        Kata.printNumber(99, '$'));

    assertEquals("""
            ****************************************
            *                                      *
            *    **    ****   ****  **  ** ******  *
            *   ***   **  ** **  ** **  ** **      *
            *  * **      **     **  **  ** *****   *
            *    **     **      **   *****     **  *
            *    **    **    **  **     **     **  *
            *  ****** ******  ****      ** *****   *
            *                                      *
            ****************************************""",
        Kata.printNumber(12345, '*'));

    assertEquals("""
            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            @                                      @
            @     @@  @@@@@@  @@@@   @@@@   @@@@   @
            @    @@   @@  @@ @@  @@ @@  @@ @@  @@  @
            @   @@@@     @@   @@@@  @@  @@ @@  @@  @
            @  @@  @@   @@    @@@@   @@@@  @@  @@  @
            @  @@  @@  @@    @@  @@   @@   @@  @@  @
            @   @@@@   @@     @@@@   @@     @@@@   @
            @                                      @
            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@""",
        Kata.printNumber(67890, '@'));
  }
}