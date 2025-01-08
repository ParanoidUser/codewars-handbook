import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("""
        CCCCC
        C
        C
        C
        CCCCC""", GenerateC.generateC(1));

    assertEquals("""
        CCCCCCCCCC
        CCCCCCCCCC
        CC
        CC
        CC
        CC
        CC
        CC
        CCCCCCCCCC
        CCCCCCCCCC""", GenerateC.generateC(2)
    );

    assertEquals("""
        CCCCCCCCCCCCCCC
        CCCCCCCCCCCCCCC
        CCCCCCCCCCCCCCC
        CCC
        CCC
        CCC
        CCC
        CCC
        CCC
        CCC
        CCC
        CCC
        CCCCCCCCCCCCCCC
        CCCCCCCCCCCCCCC
        CCCCCCCCCCCCCCC""", GenerateC.generateC(3)
    );

    assertEquals("""
        CCCCCCCCCCCCCCCCCCCC
        CCCCCCCCCCCCCCCCCCCC
        CCCCCCCCCCCCCCCCCCCC
        CCCCCCCCCCCCCCCCCCCC
        CCCC
        CCCC
        CCCC
        CCCC
        CCCC
        CCCC
        CCCC
        CCCC
        CCCC
        CCCC
        CCCC
        CCCC
        CCCCCCCCCCCCCCCCCCCC
        CCCCCCCCCCCCCCCCCCCC
        CCCCCCCCCCCCCCCCCCCC
        CCCCCCCCCCCCCCCCCCCC""", GenerateC.generateC(4)
    );
  }
}