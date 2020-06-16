interface Hist {
    static String hist(String s) {
      var report = new StringBuilder();
      for (String error : new String[] {"u", "w", "x", "z"}) {
        if (s.contains(error)) {
          int count = s.replaceAll("[^" + error + "]", "").length();
          report.append(String.format("%s  %d%s%s\r", error, count, " ".repeat(6 - (count + "").length()), "*".repeat(count)));
        }
      }
      return report.toString().trim();
    }
}
