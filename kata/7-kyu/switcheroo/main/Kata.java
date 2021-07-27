interface Switch {
  static String switcheroo(String x) {
    return x.replace('a', '_').replace('b', 'a').replace('_', 'b');
  }
}
