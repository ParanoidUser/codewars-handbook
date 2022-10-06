import java.lang.reflect.Array;
import java.util.ArrayList;

interface Maker {
  static ArrayList<Object> make(Object array) {
    var list = new ArrayList<>();
    for (int i = 0; i < Array.getLength(array); i++) {
      list.add(Array.get(array, i));
    }
    return list;
  }
}