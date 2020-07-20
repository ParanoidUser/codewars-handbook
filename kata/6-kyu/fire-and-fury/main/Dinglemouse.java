interface Dinglemouse {
  static String fireAndFury(String tweet) {
    if (tweet.matches(".*[^EFIRUY].*") || !tweet.matches(".*?(FURY|FIRE).*")) {
      return "Fake tweet.";
    }
    tweet = tweet.replace("FIRE", "1").replace("FURY", "2").replaceAll("[A-Z]", "");
    for (int i = tweet.length(); i > 0; i--) {
      tweet = tweet.replaceAll("1".repeat(i), " You " + "and you ".repeat(i - 1) + "are fired!")
                   .replaceAll("2".repeat(i), " I am " + "really ".repeat(i - 1) + "furious.");
    }
    return tweet.trim();
  }
}