import static java.util.regex.Pattern.compile;

class Drinkin {
  String hydrate(String drinkString) {
    long glasses = compile("\\D+").splitAsStream(drinkString).mapToInt(Integer::parseInt).sum();
    return glasses + " glass" + (glasses > 1 ? "es" : "") + " of water";
  }
}