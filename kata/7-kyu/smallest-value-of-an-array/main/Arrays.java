interface Arrays {
  static int findSmallest(int[] numbers, String toReturn) {
    var minI = 0;
    for (var i = 1; i < numbers.length; i++) {
      if (numbers[minI] > numbers[i]) {
        minI = i;
      }
    }
    return "index".equals(toReturn) ? minI : numbers[minI];
  }
}
