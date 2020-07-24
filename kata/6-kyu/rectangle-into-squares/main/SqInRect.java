import java.util.ArrayList;
import java.util.List;

interface SqInRect {
  static List<Integer> sqInRect(int lng, int wdth) {
    if (lng == wdth) return null;
    var result = new ArrayList<Integer>();
    while (lng * wdth > 0) {
      result.add(lng > wdth ? lng - (lng -= wdth) : wdth - (wdth -= lng));
    }
    return result;
  }
}
