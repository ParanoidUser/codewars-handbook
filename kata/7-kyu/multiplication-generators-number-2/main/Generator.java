class Generator {
   static Generator of(int a) {
    return new Generator(a);
  }

  private final int a;
  private int num = 1;

  private Generator(int a) {
    this.a = a;
  }

  String next() {
    return a + " x " + num + " = " + (a * num++);
  }
}
