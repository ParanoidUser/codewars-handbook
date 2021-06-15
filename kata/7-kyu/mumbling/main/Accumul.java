interface Accumul {
  static String accum(String s) {
    var accum = new StringBuilder();
    for (var i = 0; i < s.length(); i++) {
      accum.append('-').append(Character.toUpperCase(s.charAt(i)));
      for (var j = 0; j < i; j++) {
        accum.append(Character.toLowerCase(s.charAt(i)));
      }
    }
    return accum.substring(1);
  }
}
