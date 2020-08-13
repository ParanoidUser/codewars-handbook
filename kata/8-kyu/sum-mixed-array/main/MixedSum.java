import java.util.List;

class MixedSum {
  int sum(List<?> mixed) {
    return mixed.stream().mapToInt(x -> Integer.parseInt("" + x)).sum();
  }
}
