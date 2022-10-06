import java.util.Scanner;

interface UIB {
  static void countAs() {
    var count = 0;
    try (var in = new Scanner(System.in).useDelimiter("\\.")) {
      while (in.hasNext()) {
        count += in.next().replaceAll("[^a]", "").length();
      }
    }
    System.out.println("This program counts the number of times the vowel 'a' appears.");
    System.out.println("Please type a sentence that ends with '.': There are " + count + " 'a'.");
  }
}
