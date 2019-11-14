import java.util.List;

class MixedSum {
  static int sum(List<?> mixed) {
    return mixed.stream().mapToInt(x -> Integer.parseInt("" + x)).sum();
  }
}
