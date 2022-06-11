interface Dinglemouse {
  static int deadAntCount(String ants) {
    if (ants != null) {
      ants = ants.replace("ant", "");
    }
    return ants == null || ants.isBlank() ? 0 :
           Math.max(Math.max(ants.replaceAll("[^a]", "").length(), ants.replaceAll("[^t]", "").length()), ants.replaceAll("[^n]", "").length());
  }
}
