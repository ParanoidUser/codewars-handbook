interface PhoneWords {
  static String phoneWords(String str) {
    return str != null ? str
            .replace("222", "c").replace("22", "b").replace("2", "a")
            .replace("333", "f").replace("33", "e").replace("3", "d")
            .replace("444", "i").replace("44", "h").replace("4", "g")
            .replace("555", "l").replace("55", "k").replace("5", "j")
            .replace("666", "o").replace("66", "n").replace("6", "m")
            .replace("7777", "s").replace("777", "r").replace("77", "q").replace("7", "p")
            .replace("888", "v").replace("88", "u").replace("8", "t")
            .replace("9999", "z").replace("999", "y").replace("99", "x").replace("9", "w")
            .replace("1", "").replace("0", " ") : "";
  }
}