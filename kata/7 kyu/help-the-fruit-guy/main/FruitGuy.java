import static java.util.Arrays.stream;

class FruitGuy {
  static String[] removeRotten(String[] fruitBasket) {
    return fruitBasket == null ? new String[0] : stream(fruitBasket).map(s -> s.replace("rotten", "").toLowerCase()).toArray(String[]::new);
  }
}
