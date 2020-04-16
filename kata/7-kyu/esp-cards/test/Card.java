public class Card {
  static char[][] makeSquareCard() {
    return new char[][] {
      "/-------------------\\".toCharArray(),
      "|                   |".toCharArray(),
      "|                   |".toCharArray(),
      "|    ***********    |".toCharArray(),
      "|    *         *    |".toCharArray(),
      "|    *         *    |".toCharArray(),
      "|    *         *    |".toCharArray(),
      "|    *         *    |".toCharArray(),
      "|    *         *    |".toCharArray(),
      "|    ***********    |".toCharArray(),
      "|                   |".toCharArray(),
      "|                   |".toCharArray(),
      "\\-------------------/".toCharArray()
    };
  }

  static char[][] makeDiamondCard() {
    return new char[][] {
      "/-------------------\\".toCharArray(),
      "|                   |".toCharArray(),
      "|         *         |".toCharArray(),
      "|        * *        |".toCharArray(),
      "|       *   *       |".toCharArray(),
      "|      *     *      |".toCharArray(),
      "|     *       *     |".toCharArray(),
      "|      *     *      |".toCharArray(),
      "|       *   *       |".toCharArray(),
      "|        * *        |".toCharArray(),
      "|         *         |".toCharArray(),
      "|                   |".toCharArray(),
      "\\-------------------/".toCharArray()
    };
  }

  static char[][] makeCircleCard() {
    return new char[][] {
      "/-------------------\\".toCharArray(),
      "|                   |".toCharArray(),
      "|                   |".toCharArray(),
      "|       *****       |".toCharArray(),
      "|     *       *     |".toCharArray(),
      "|    *         *    |".toCharArray(),
      "|    *         *    |".toCharArray(),
      "|    *         *    |".toCharArray(),
      "|     *       *     |".toCharArray(),
      "|       *****       |".toCharArray(),
      "|                   |".toCharArray(),
      "|                   |".toCharArray(),
      "\\-------------------/".toCharArray()
    };
  }
}
