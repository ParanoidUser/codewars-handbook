interface SimpleStringDivision {
  static int solve(String s, int k) {
    var count = 0;
    var numbers = s.split(" ");
    for (var i = 0; i < numbers.length; i++) {
      for (var j = 0; j < numbers.length; j++) {
        if (i != j && Integer.parseInt(numbers[i] + numbers[j]) % k == 0) {
          count++;
        }
      }
    }
    return count;
  }
}
