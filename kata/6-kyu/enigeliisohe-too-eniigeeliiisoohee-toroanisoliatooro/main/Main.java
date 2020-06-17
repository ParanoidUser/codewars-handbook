interface Main {
  static String toexuto(String text) {
    return text.replaceAll("((?i)[b-d])", "$1a")
               .replaceAll("((?i)[f-h])", "$1e")
               .replaceAll("((?i)[j-n])", "$1i")
               .replaceAll("((?i)[p-t])", "$1o")
               .replaceAll("((?i)[v-z])", "$1u");
  }
}