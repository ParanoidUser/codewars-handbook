import static java.lang.CharSequence.compare;

interface Dinglemouse {
  static boolean same(String a, String b) {
    return compare(a, b) == 0;
  }
}