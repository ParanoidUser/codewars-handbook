interface HeavyMetalUmlauts {
  static String heavyMetalUmlauts(String boringText) {
    return boringText
        .replace("A", "Ä")
        .replace("a", "ä")
        .replace("O", "Ö")
        .replace("o", "ö")
        .replace("E", "Ë")
        .replace("e", "ë")
        .replace("U", "Ü")
        .replace("u", "ü")
        .replace("I", "Ï")
        .replace("i", "ï")
        .replace("Y", "Ÿ")
        .replace("y", "ÿ");
  }
}
