import static java.util.stream.IntStream.of;

interface Hunt {
  static String assess(int[] booj, String[] bloog) {
    int i = of(64, 65, 66, 67, 36, 37, 6, 7, 8, 9, 10, 43, 44, 77, 78,79, 80)
        .filter(j -> bloog[j & 31].equals("snark"))
        .map(j -> 2 * (j >> 5) + (booj[j & 31] > 14 ? 1 : 0)).findFirst().orElse(-1);
    return switch (i) {
      case 0 -> "Pounce!";
      case 1 -> "Run!";
      case 2 -> "Stalk quietly...";
      case 3 -> "Escape quietly...";
      case 4 -> "There's a Snark close.";
      case 5 -> "There's a Boojum close.";
      default -> "Keep hunting.";
    };
  }
}