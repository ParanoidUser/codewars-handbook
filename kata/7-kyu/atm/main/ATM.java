class ATM {
  int solve(int n) {
    int notes = 0;
    for (int bill : new int[] {500, 200, 100, 50, 20, 10}) {
      notes += n / bill;
      n %= bill;
    }
    return n == 0 ? notes : -1;
  }
}
