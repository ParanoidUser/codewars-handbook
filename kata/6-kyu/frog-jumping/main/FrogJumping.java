import java.util.HashSet;

interface FrogJumping {
  static int solution(int[] a) {
    var track = new HashSet<>();
    for (int j = 0, i = 0; a.length > 0 && track.add(i); j++, i += a[i]) {
      if (i < 0 || i >= a.length) {
        return j;
      }
    }
    return -1;
  }
}
