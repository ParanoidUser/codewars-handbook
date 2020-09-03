import static java.util.Arrays.stream;

class Swappairs {
  Object[][][] swapp(Object[][] input) {
    return new Object[][][] {input, stream(input).map(p -> new Object[] {p[1], p[0]}).toArray(Object[][]::new)};
  }
}
