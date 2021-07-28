import static java.util.stream.IntStream.range;

interface CodeWars {
  static boolean checkVin(String vin) {
    int[] d = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 1, 2, 3, 4, 5, 0, 7, 0, 9, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] w = {8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};
    return vin.matches("[0-9A-HJ-NPR-Z]{17}") &&
        (vin.charAt(8) == 'X' ? 10 : vin.charAt(8) - 48) == range(0, 17).map(i -> d[vin.charAt(i) - 48] * w[i]).sum() % 11;
  }
}