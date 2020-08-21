interface CaffeineBuzz {
  static String caffeineBuzz(int n) {
    return n % 12 == 0 ? "CoffeeScript" : n % 6 == 0 ? "JavaScript" : n % 3 == 0 ? "Java" : "mocha_missing!";
  }
}
