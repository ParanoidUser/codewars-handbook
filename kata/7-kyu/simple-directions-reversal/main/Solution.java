import static java.util.stream.IntStream.range;

interface Solution {
  static String[] solve(String[] arr) {
    var state = new String[]{"Begin"};
    return range(0, arr.length).mapToObj(i -> {
      var move = state[0] + arr[arr.length - 1 - i].replaceFirst(".\\w+ ", " ");
      state[0] = arr[arr.length - 1 - i].startsWith("Left") ? "Right" : "Left";
      return move;
    }).toArray(String[]::new);
  }
}