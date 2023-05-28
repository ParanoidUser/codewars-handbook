import java.util.ArrayList;
import java.util.List;
import java.util.Map;

interface PickPeaks {
  static Map<String, List<Integer>> getPeaks(int[] arr) {
    var peaks = Map.<String, List<Integer>>of("pos", new ArrayList<>(), "peaks", new ArrayList<>());
    for (int i = 1, j = 0; i < arr.length; i++) {
      if (arr[i - 1] > arr[i] && j > 0) {
        peaks.get("pos").add(j);
        peaks.get("peaks").add(arr[j]);
      }
      j = arr[i - 1] < arr[i] ? i : arr[i - 1] > arr[i] ? 0 : j;
    }
    return peaks;
  }
}