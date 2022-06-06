interface SequenceSum {
  static int[] sumOfN(int n) {
    var seq = new int[Math.abs(n) + 1];
    for (var i = 1; i < seq.length; i++) {
      seq[i] = seq[i - 1] + (n > 0 ? i : -i);
    }
    return seq;
  }
}
