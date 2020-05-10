interface Alarm {
  static boolean setAlarm(boolean employed, boolean vacation) {
    return employed && !vacation;
  }
}
