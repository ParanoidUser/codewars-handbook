import static java.util.List.of;

interface Solution {
  static boolean check(Object[] a, Object x) {
    return of(a).contains(x);
  }
}
