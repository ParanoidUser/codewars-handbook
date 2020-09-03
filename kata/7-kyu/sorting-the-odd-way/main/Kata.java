import static java.util.Arrays.sort;

interface Kata {
  static Double[] sortItOut(Double[] array) {
    sort(array, (a, b) -> (int) (Math.floor(a % 2) != 0
                    ? Math.floor(b % 2) != 0 ? Math.floor(a - b) : -1
                    : Math.floor(b % 2) == 0 ? Math.floor(b - a) : 1));
    return array;
  }
}
