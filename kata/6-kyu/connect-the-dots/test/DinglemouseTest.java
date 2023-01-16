import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DinglemouseTest {

  @Test
  void sample() {
    assertEquals("""
                      \s
             *********\s
             *       *\s
             *       *\s
             *********\s
                      \s
            """,
        Dinglemouse.connectTheDots("""
                      \s
             a       b\s
             e        \s
                      \s
             d       c\s
                      \s
            """
        )
    );

    assertEquals("""
                      \s
                 *    \s
                * *   \s
               *   *  \s
              *     * \s
               *   *  \s
                * *   \s
                 *    \s
                      \s
            """,
        Dinglemouse.connectTheDots("""
                      \s
                 a    \s
                e     \s
                      \s
              d     b \s
                      \s
                      \s
                 c    \s
                      \s
            """
        )
    );

    assertEquals("""
              * \s
             ** \s
            * * \s
              * \s
              * \s
              * \s
              * \s
            *****
            """,
        Dinglemouse.connectTheDots("""
              d \s
                \s
            e   \s
                \s
                \s
                \s
                \s
            a c b
            """
        )
    );
  }
}