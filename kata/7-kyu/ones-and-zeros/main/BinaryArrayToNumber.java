import java.util.List;

interface BinaryArrayToNumber {
  static int ConvertBinaryArrayToInt(List<Integer> binary) {
    return binary.stream().reduce((x, y) -> 2 * x + y).orElse(0);
  }
}
