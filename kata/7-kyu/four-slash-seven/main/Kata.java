import static java.util.Map.of;

interface Kata {
  static int fourSeven(int n) {
    return of(4, 7, 7, 4).getOrDefault(n, 0);
  }
}