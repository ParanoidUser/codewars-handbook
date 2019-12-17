import java.util.Set;

class Kata {
  static boolean isTune(int[] notes) {
    if (notes == null) return false;
    for (int n : notes) {
      int keys = 0;
      for (int i : notes) {
        if (Set.of(-10, -8, -6, -5, -3, -1, 0, 2, 4, 5, 6, 7, 9, 11).contains((i - n) % 12)) {
          if (++keys == notes.length) {
            return true;
          }
        } else {
          break;
        }
      }
    }
    return false;
  }
}
