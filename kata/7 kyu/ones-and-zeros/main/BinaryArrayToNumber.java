import java.util.List;

class BinaryArrayToNumber {
  static int ConvertBinaryArrayToInt(List<Integer> binary) {
    return binary.stream().reduce((x, y) -> 2 * x + y).orElse(0);
  }
}
