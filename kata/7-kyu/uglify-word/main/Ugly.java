 interface Ugly {
   static String uglifyWord(String str) {
    var ugly = new StringBuilder();
     var up = true;
    for (char c : str.toCharArray()) {
      if (Character.isAlphabetic(c)) {
        c = up ? Character.toUpperCase(c) : Character.toLowerCase(c);
        up = !up;
      } else {
        up = true;
      }
      ugly.append(c);
    }
    return ugly.toString();
  }
}