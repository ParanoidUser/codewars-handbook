interface Solution {
  static String whoLikesIt(String... names) {
    if (names.length < 2) {
      return (names.length > 0 ? names[0] : "no one") + " likes this";
    }
    else if (names.length == 2) {
      return names[0] + " and " + names[1] + " like this";
    }
    return names[0] + ", " + names[1]  + " and " + (names.length > 3 ? names.length - 2 + " others" : names[2]) + " like this";
  }
}
