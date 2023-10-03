interface LandPerimiter {
  static String landPerimeter(String[] arr) {
    int perimeter = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length(); j++) {
        if (arr[i].charAt(j) == 'X') {
          perimeter += 4;
          if (j > 0 && arr[i].charAt(j - 1) == 'X') {
            perimeter -= 2;
          }
          if (i > 0 && arr[i].charAt(j) == arr[i - 1].charAt(j)) {
            perimeter -= 2;
          }
        }
      }
    }
    return "Total land perimeter: " + perimeter;
  }
}