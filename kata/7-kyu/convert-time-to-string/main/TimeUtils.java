interface TimeUtils {
  static String convertTime(int timeDiff) {
    return timeDiff / 86400 + " " + timeDiff % 86400 / 3600 + " " + timeDiff % 3600 / 60 + " " + timeDiff % 60;
  }
}
