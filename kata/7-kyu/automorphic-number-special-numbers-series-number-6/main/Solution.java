interface Solution {
  static String autoMorphic(int number) {
    return (number * number + "").endsWith(number + "") ? "Automorphic" : "Not!!";
  }
}
