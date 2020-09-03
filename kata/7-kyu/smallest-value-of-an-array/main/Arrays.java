interface Arrays {
  static int findSmallest(int[] numbers, String toReturn) {
    int minI = 0;
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[minI] > numbers[i]) {
        minI = i;
      }
    }
    return "index".equals(toReturn) ? minI : numbers[minI];
  }
}
