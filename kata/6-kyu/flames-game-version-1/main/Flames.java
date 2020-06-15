interface Flames {
  static String showRelationship(String male, String female) {
    var mix = male.replaceAll("[" + female + "]", "") + female.replaceAll("[" + male + "]", "");
    return new String[]{"Siblings", "Friendship", "Love", "Affection", "Marriage", "Enemies"}[mix.length() % 6];
  }
}