class Kata {
  boolean isAnagram(String test, String original) {
    for (char c : test.toCharArray()) {
      if (!original.toLowerCase().contains("" + Character.toLowerCase(c))) {
        return false;
      }
    }
    return test.length() == original.length();
  }
}
