import java.util.ArrayList;

class Encoder {
  static String compress(int[] raw) {
    var encoded = new ArrayList<String>();
    for (int i = 0; i < raw.length; ++i) {
      int j = i;
      if (i == raw.length - 1) {
        encoded.add("" + raw[i]);
      } else {
        int diff = raw[j + 1] - raw[j];
        while (j < raw.length - 1 && raw[j + 1] == raw[j] + diff) ++j;
        if (diff == 0) {
          encoded.add(raw[i] + "*" + (j - i + 1));
          i = j;
        } else if (j - i > 1) {
          encoded.add(raw[i] + "-" + raw[j] + (Math.abs(diff) == 1 ? "" : ("/" + Math.abs(diff))));
          i = j;
        } else {
          encoded.add(raw[i] + "");
        }
      }
    }
    return String.join(",", encoded);
  }
}
