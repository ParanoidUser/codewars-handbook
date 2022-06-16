interface Main {
  static int name(String[] strings) {
    return findMaxLength(strings, 0, new StringBuilder(), 0);
  }

  private static int findMaxLength(String[] input, int start, StringBuilder temp, int max) {
    for (int i = start; i < input.length; i++) {
      temp.append(input[i]);
      if (temp.chars().map(c -> c - 96).sum() <= 10 * temp.length()) {
        max = Math.max(max, temp.length());
      }
      max = findMaxLength(input, i + 1, temp, max);
      temp.setLength(temp.length() - input[i].length());
    }
    return max;
  }
}