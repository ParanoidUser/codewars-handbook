interface Frame {
  static int[] frame(String score) {
    var result = new int[2];
    for (var match : score.replaceAll("\\([^)]+\\)", "").split(";")) {
      var one = Integer.parseInt(match.substring(0, match.indexOf('-')).trim());
      var two = Integer.parseInt(match.substring(match.indexOf('-') + 1).trim());
      result[one > two ? 0 : 1]++;
    }
    return result;
  }
}
