interface SimpleStringDivision {
  static int solve(String s, int k) {
    int count = 0;
    var numbers = s.split(" ");
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if (i != j && Integer.parseInt(numbers[i] + numbers[j]) % k == 0) {
          count++;
        }
      }
    }
    return count;
  }
}
