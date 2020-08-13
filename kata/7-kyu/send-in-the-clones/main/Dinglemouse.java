interface Dinglemouse {
  static long[] clonewars(int kataPerDay) {
    return new long[] {
      (long) Math.ceil(Math.pow(2, kataPerDay - 1.)),
      (long) Math.pow(2, kataPerDay + 1.) - kataPerDay - 2
    };
  }
}
