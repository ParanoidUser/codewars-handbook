interface EasyBal {
  static String balance(String book) {
    var lines = book.replaceAll("[^\\w\n. ]", "").split("\n");
    var newLine = "\\r\\n";
    var report = new StringBuilder("Original Balance: " + lines[0] + newLine);
    double balance = Double.parseDouble(lines[0]);
    double sum = 0;
    for (int i = 1; i < lines.length; i++) {
      sum += Double.parseDouble(lines[i].split("\\s+")[2]);
      report.append(lines[i].trim().replaceAll("\\s+", " ")).append(String.format(" Balance %.2f", balance - sum)).append(newLine);
    }
    return report + String.format("Total expense  %.2f%sAverage expense  %.2f", sum, newLine, sum / (lines.length - 1));
  }
}