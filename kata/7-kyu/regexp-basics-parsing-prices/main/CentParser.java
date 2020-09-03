interface CentParser {
  static Integer toCents(String price) {
    return price.matches("\\$\\d+\\.\\d{2}") ? Integer.parseInt(price.replaceAll("[$.]", "")) : null;
  }
}
