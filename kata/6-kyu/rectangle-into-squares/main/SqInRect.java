import java.util.ArrayList;
import java.util.List;

interface SqInRect {
  static List<Integer> sqInRect(int lng, int wdth) {
    var result = new ArrayList<Integer>();
    if (lng == wdth) return result;
    while (lng * wdth > 0) {
      if (lng > wdth) {
        int tmp = lng;
        lng -= wdth;
        result.add(tmp - lng);
      } else {
        int tmp = wdth;
        wdth -= lng;
        result.add(tmp - wdth);
      }
    }
    return result;
  }
}
