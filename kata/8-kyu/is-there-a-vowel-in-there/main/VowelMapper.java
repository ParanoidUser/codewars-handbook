import java.util.List;

interface VowelMapper {
  static List<Object> isVow(List<Integer> a) {
    return a.stream().map(i -> (Object) ("aeiou".indexOf(i) < 0 ? i : ((char) i.intValue()) + "")).toList();
  }
}