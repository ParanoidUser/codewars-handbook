class Frame {
  static int[] frame(String score) {
    int[] result = new int[2];
    for (var match : score.replaceAll("\\(.*?\\)", "").split(";")) {
      var one = Integer.parseInt(match.substring(0, match.indexOf('-')).trim());
      var two = Integer.parseInt(match.substring(match.indexOf('-') + 1).trim());
      if (one > two) {
        result[0]++;
      } else {
        result[1]++;
      }
    }
    return result;
  }
}
