class Dinglemouse {
  static int deadAntCount(String ants) {
    return ants == null || (ants = ants.replace("ant", "")).isBlank() ? 0 :
           Math.max(Math.max(ants.replaceAll("[^a]", "").length(), ants.replaceAll("[^t]", "").length()), ants.replaceAll("[^n]", "").length());
  }
}
