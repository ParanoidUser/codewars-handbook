import static java.util.stream.IntStream.concat;
import static java.util.stream.IntStream.of;

 interface Kata {
   static int[] testit(int[] a, int[] b) {
    return concat(of(a).distinct(), of(b).distinct()).sorted().toArray();
  }
}
