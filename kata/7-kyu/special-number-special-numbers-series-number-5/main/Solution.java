interface Solution {
  static String specialNumber(int number) {
    return ("" + number).matches("[0-5]+") ? "Special!!" : "NOT!!";
  }
}
