class SequenceSum {
  static String showSequence(int value) {
    if (value < 1) return value + (value == 0 ? "=0" : "<0");

    var seq = new StringBuilder();
    for (int i = 0; i <= value; i++) seq.append(i).append("+");
    return seq.deleteCharAt(seq.length() - 1).append(" = ").append(value * (value + 1) / 2).toString();
  }
}
