import static java.util.stream.Collectors.toList;

import java.util.List;

class Rotations {
  static boolean containAllRots(String strng, List<String> arr) {
    arr = arr.stream().map(String::toLowerCase).collect(toList());
    for (int i = 0; i < strng.length(); i++) {
      if (!arr.contains(strng.toLowerCase())) {
        return false;
      }
      strng = strng.charAt(strng.length() - 1) + strng.substring(0, strng.length() - 1);
    }
    return true;
  }
}
