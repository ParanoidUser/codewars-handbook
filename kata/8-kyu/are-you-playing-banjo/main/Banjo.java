interface Banjo {
  static String areYouPlayingBanjo(String name) {
    return name + (name.matches("^[Rr].*$") ? " plays banjo" : " does not play banjo");
  }
}
