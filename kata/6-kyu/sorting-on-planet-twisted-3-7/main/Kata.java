import static java.util.Arrays.stream;

import java.util.function.IntUnaryOperator;

interface Kata {
 static Integer[] sortTwisted37(Integer[] array) {
     IntUnaryOperator twist = i -> Integer.parseInt((i + "").replace('3', '_').replace('7', '3').replace('_', '7'));
    return stream(array).map(twist::applyAsInt).sorted().map(twist::applyAsInt).toArray(Integer[]::new);
  }
}
