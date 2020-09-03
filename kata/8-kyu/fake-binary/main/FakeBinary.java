class FakeBinary {
  String fakeBin(String s) {
    return s.replaceAll("[1-4]", "0").replaceAll("[^0]", "1");
  }
}
