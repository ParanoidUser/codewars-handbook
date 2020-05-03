interface Kata {
  static String bonusTime(int salary, boolean bonus) {
    return "£" + salary + (bonus ? '0' : "");
  }
}
