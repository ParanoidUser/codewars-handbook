class Encoder {
  String compress(int[] raw) {
    var encoded = new StringBuilder();
    int i = 0;
    for (; i < raw.length; i++) {
      int j = 1;
      int diff = i < raw.length - 1 ? raw[i + 1] - raw[i] : 1;
      while (j + i < raw.length && raw[j + i] == raw[i] + j * diff) {
        j++;
      }

      encoded.append(',').append(raw[i]);
      if (diff == 0) {
        i += j - 1;
        encoded.append('*').append(j);
      } else if (j > 2) {
        i += j - 1;
        encoded.append('-').append(raw[i]).append(Math.abs(diff) != 1 ? "/" + Math.abs(diff) : "");
      }
    }
    return encoded.substring(1);
  }
}
