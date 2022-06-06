import java.util.ArrayList;
import java.util.List;

interface SqInRect {
  static List<Integer> sqInRect(int lng, int wdth) {
    var result = new ArrayList<Integer>();
    if (lng == wdth) return result;
    while (lng * wdth > 0) {
      result.add(lng > wdth ? lng - (lng -= wdth) : wdth - (wdth -= lng));
    }
    return result;
  }
}
