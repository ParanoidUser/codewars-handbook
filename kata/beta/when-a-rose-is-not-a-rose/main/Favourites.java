interface Favourites {
  static boolean isFavourite(String item) {
    return item.matches("(?i)rose\\s*");
  }
}