import static java.util.List.of;

interface Dinglemouse {
  enum MyNumber {
    ONE, TWO, THREE, FOUR;

    int intValue() {
      return ordinal() + 1;
    }
  }

  static MyNumber getNumber(String name) {
    return of(MyNumber.values()).get(("_oneichiun____twonideux____threesantroisfourshiquatre").indexOf(name) / 13);
  }
}
