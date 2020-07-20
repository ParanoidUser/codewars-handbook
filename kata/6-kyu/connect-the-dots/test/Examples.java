import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Examples {
  @Test
  void sample() {
    assertEquals(
      "           \n" +
      " ********* \n" +
      " *       * \n" +
      " *       * \n" +
      " ********* \n" +
      "           \n",
      Dinglemouse.connectTheDots(
        "           \n" +
        " a       b \n" +
        " e         \n" +
        "           \n" +
        " d       c \n" +
        "           \n"
      )
    );

    assertEquals(
      "           \n" +
      "     *     \n" +
      "    * *    \n" +
      "   *   *   \n" +
      "  *     *  \n" +
      "   *   *   \n" +
      "    * *    \n" +
      "     *     \n" +
      "           \n",
      Dinglemouse.connectTheDots(
        "           \n" +
        "     a     \n" +
        "    e      \n" +
        "           \n" +
        "  d     b  \n" +
        "           \n" +
        "           \n" +
        "     c     \n" +
        "           \n"
      )
    );

    assertEquals(
      "  *  \n" +
      " **  \n" +
      "* *  \n" +
      "  *  \n" +
      "  *  \n" +
      "  *  \n" +
      "  *  \n" +
      "*****\n",
      Dinglemouse.connectTheDots(
        "  d  \n" +
        "     \n" +
        "e    \n" +
        "     \n" +
        "     \n" +
        "     \n" +
        "     \n" +
        "a c b\n"
      )
    );
  }
}