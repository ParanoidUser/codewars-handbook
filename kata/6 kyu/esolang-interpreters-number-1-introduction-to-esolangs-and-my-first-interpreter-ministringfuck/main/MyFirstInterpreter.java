class MyFirstInterpreter {
  private String ascii = "";

  MyFirstInterpreter(String code) {
    code = code.replaceAll("[^+.]", "");
    for (int i = 0, sum = 0; i < code.length(); i++) {
      if (code.charAt(i) == '+') {
        sum = ++sum % 256;
      } else {
        ascii += (char) sum;
      }
    }
  }

  String interpret() {
    return ascii;
  }
}
