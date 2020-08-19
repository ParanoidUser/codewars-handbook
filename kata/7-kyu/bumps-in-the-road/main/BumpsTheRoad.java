interface BumpsTheRoad {
  static String bumps(String road) {
    return road.replace("_", "").length() > 15 ? "Car Dead" : "Woohoo!";
  }
}
