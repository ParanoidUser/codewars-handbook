interface Kata {
  static String swap(String st) {
    return st.replace("a", "A")
        .replace("e", "E")
        .replace("i", "I")
        .replace("o", "O")
        .replace("u", "U");
  }
}
