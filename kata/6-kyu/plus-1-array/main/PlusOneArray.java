import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.of;

import java.math.BigInteger;

interface PlusOneArray {
  static int[] upArray(int[] arr) {
    return arr.length < 1 || of(arr).anyMatch(n -> n < 0 || n > 9) ? null :
        new BigInteger(of(arr).mapToObj(n -> n + "").collect(joining()))
            .add(BigInteger.ONE).toString().chars().map(c -> c - '0').toArray();
  }
}