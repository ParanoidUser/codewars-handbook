interface CookingTime {
  static String getTime(String neededPower, int minutes, int seconds, String power) {
    int ep = Integer.parseInt(neededPower.replace("W", ""));
    int ap = Integer.parseInt(power.replace("W", ""));
    seconds = (int) Math.ceil((seconds + 60. * minutes) * ep / ap);
    return seconds / 60 + " minutes " + seconds % 60 + " seconds";
  }
}
