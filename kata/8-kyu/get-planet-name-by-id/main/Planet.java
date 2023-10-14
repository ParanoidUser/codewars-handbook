interface Planet {
  static String getPlanetName(int id) {
    return new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"}[--id];
  }
}