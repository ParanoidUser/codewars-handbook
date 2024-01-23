interface CuckooClock {
  static String cuckooClock(String inputTime, int chimes) {
    int hours = Integer.parseInt(inputTime.substring(0, 2));
    int quarters = (int) (Math.ceil(Integer.parseInt(inputTime.substring(3, 5)) / 15.)) - 1;
    do {
      hours += ++quarters / 4;
      hours = hours % 13 + hours / 13;
      quarters %= 4;
    } while ((chimes -= quarters == 0 ? hours : 1) > 0);
    return String.format("%02d:%02d", hours, 15 * quarters);
  }
}