interface Solution {
  static String solve(String time) {
    String[] hh = "midnight,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,one,two,three,four,five,six,seven,eight,nine,ten,eleven,midnight".split(",");
    String[] mm = "o'clock,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,quarter,sixteen,seventeen,eighteen,nineteen,twenty,twenty one,twenty two,twenty three,twenty four,twenty five,twenty six,twenty seven,twenty eight,twenty nine,half".split(",");
    int h = Integer.parseInt(time.substring(0, 2));
    int m = Integer.parseInt(time.substring(3));
    return m == 0 ?
        String.format("%s%s", hh[h], h > 0 ? " " + mm[m] : "") :
        String.format("%s%s %s %s", mm[m > 30 ? 60 - m : m], m % 15 == 0 ? "" : m == 1 || m == 59 ? " minute" : " minutes", m > 30 ? "to" : "past", hh[h + m / 31]);
  }
}