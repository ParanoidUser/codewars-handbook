interface Drinks {
  static String peopleWithAgeDrink(int age) {
    return "drink " + (age < 14 ? "toddy" : age < 18 ? "coke" : age < 21 ? "beer" : "whisky");
  }
}