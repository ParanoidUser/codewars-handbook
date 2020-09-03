class Conversion {
  String solution(int n) {
    return "I".repeat(n)
        .replace("IIIII", "V").replace("IIII", "IV")
        .replace("VV", "X").replace("VIV", "IX")
        .replace("XXXXX", "L").replace("XXXX", "XL")
        .replace("LL", "C").replace("LXL", "XC")
        .replace("CCCCC", "D").replace("CCCC", "CD")
        .replace("DD", "M").replace("DCD", "CM");
  }
}
