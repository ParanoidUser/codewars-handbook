import java.util.Arrays;

interface Kata {
  static String[] getW(int height) {
    var w = new String[height < 2 ? 0 : height];
    for (int i = 0, j = 2 * (height - 1); i < w.length; i++) {
      var line = new String[4 * height - 3];
      Arrays.fill(line, " ");
      line[i] = line[j - i] = line[j + i] = line[2 * j - i] = "*";
      w[i] = String.join("", line);
    }
    return w;
  }
}
