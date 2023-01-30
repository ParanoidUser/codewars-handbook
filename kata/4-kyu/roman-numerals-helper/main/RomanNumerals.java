import java.util.Map;

interface RomanNumerals {
  static String toRoman(int n) {
    return "I".repeat(n)
        .replace("IIIII", "V").replace("IIII", "IV")
        .replace("VV", "X").replace("VIV", "IX")
        .replace("XXXXX", "L").replace("XXXX", "XL")
        .replace("LL", "C").replace("LXL", "XC")
        .replace("CCCCC", "D").replace("CCCC", "CD")
        .replace("DD", "M").replace("DCD", "CM");
  }

  static int fromRoman(String s) {
    var map = Map.of('M', 1000, 'D', 500, 'C', 100, 'L', 50, 'X', 10, 'V', 5, 'I', 1);
    int sum = 0;
    int next = 0;
    for (char c : s.toCharArray()) {
      int value = map.get(c);
      sum += next < value ? -next : next;
      next = value;
    }
    return sum + next;
  }
}