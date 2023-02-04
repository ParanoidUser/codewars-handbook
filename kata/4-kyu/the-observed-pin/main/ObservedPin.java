import java.util.LinkedList;
import java.util.List;

interface ObservedPin {
  static List<String> getPINs(String observed) {
    String[] neigh = {"08", "124", "2135", "326", "4157", "52468", "6359", "748", "80579", "968"};
    List<String> combs = List.of("");
    for (char d : observed.toCharArray()) {
      List<String> temp = new LinkedList<>();
      for (char n : neigh[d - 48].toCharArray()) {
        for (String o : combs) {
          temp.add(o + n);
        }
      }
      combs = temp;
    }
    return combs;
  }
}