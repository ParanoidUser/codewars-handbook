interface FreeUrinals {
  static int getFreeUrinals(String urinals) {
    return urinals.contains("11") ? -1 : urinals.replaceAll("010|10|01", "1").replace("00", "0").replace("1", "").length();
  }
}
