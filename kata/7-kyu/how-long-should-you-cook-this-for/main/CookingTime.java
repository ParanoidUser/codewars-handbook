interface CookingTime {
  static String getTime(String neededPower, int minutes, int seconds, String power) {
    var ep = Integer.parseInt(neededPower.replace("W", ""));
    var ap = Integer.parseInt(power.replace("W", ""));
    seconds = (int) Math.ceil((seconds + 60. * minutes) * ep / ap);
    return seconds / 60 + " minutes " + seconds % 60 + " seconds";
  }
}
