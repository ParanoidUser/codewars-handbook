class ArabicToRomanConverter {
  String toRoman(int arabic) {
    return arabic < 1 || arabic > 999 ? "NaR" : "I".repeat(arabic)
        .replace("IIIII", "V").replace("IIII", "IV")
        .replace("VV", "X").replace("VIV", "IX")
        .replace("XXXXX", "L").replace("XXXX", "XL")
        .replace("LL", "C").replace("LXL", "XC")
        .replace("CCCCC", "D").replace("CCCC", "CD")
        .replace("DD", "M").replace("DCD", "CM");
  }
}