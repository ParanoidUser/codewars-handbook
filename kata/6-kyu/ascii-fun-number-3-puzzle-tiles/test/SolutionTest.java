import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("""
           _( )__
         _|     _|
        (_   _ (_
         |__( )_|""", ASCIIFun.puzzleTiles(1, 1));
    assertEquals("""
           _( )__ _( )__ _( )__
         _|     _|     _|     _|
        (_   _ (_   _ (_   _ (_
         |__( )_|__( )_|__( )_|
         |_     |_     |_     |_
          _) _   _) _   _) _   _)
         |__( )_|__( )_|__( )_|""", ASCIIFun.puzzleTiles(3, 2));
  }
}