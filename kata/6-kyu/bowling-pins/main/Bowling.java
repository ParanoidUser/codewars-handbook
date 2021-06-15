class Bowling {
  String bowlingPins(int[] arr) {
    var pins = "7 8 9 0\n 4 5 6 \n  2 3  \n   1   ";
    for (int n : arr) {
      pins = pins.replace(n % 10 + "", " ");
    }
    return pins.replaceAll("\\d", "I");
  }
}
