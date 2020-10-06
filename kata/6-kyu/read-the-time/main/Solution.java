interface Solution {
  String[] H = "midnight,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,one,two,three,four,five,six,seven,eight,nine,ten,eleven,midnight".split(",");
  String[] M = "o'clock,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,quarter,sixteen,seventeen,eighteen,nineteen,twenty,twenty one,twenty two,twenty three,twenty four,twenty five,twenty six,twenty seven,twenty eight,twenty nine,half".split(",");

  static String solve(String time) {
    int h = Integer.parseInt(time.substring(0, 2)), m = Integer.parseInt(time.substring(3));
    return m == 0 ?
        String.format("%s%s", H[h], h > 0 ? " " + M[m] : "") :
        String.format("%s%s %s %s", M[m > 30 ? 60 - m : m], m % 15 == 0 ? "" : m == 1 || m == 59 ? " minute" : " minutes", m > 30 ? "to" : "past", H[h + m / 31]);
  }
}