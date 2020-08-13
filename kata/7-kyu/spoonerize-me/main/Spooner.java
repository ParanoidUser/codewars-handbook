class Spooner {
  String spoonerize(String text) {
    var words = text.split(" ");
    return words[1].charAt(0) + words[0].substring(1) + " " + words[0].charAt(0) + words[1].substring(1);
  }
}
