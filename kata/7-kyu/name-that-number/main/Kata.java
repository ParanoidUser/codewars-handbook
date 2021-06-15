interface Kata {
  static String nameThatNumber(int x) {
    var unit = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    var tens = new String[]{"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    return x < 20 ? unit[x] : tens[x / 10 - 2] + (x % 10 == 0 ? "" : " " + unit[x % 10]);
  }
}
