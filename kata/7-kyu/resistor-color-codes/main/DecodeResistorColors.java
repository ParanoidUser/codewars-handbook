import java.util.List;

interface DecodeResistorColors {
  static String decodeResistorColors(String bands) {
    var codes = List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white");
    var r = bands.split(" ");

    double ohms = (int) ((10 * codes.indexOf(r[0]) + codes.indexOf(r[1])) * Math.pow(10, codes.indexOf(r[2])));
    if (ohms > 999999) {
      r[0] = ohms / 10e5 + "M";
    } else if (ohms > 999) {
      r[0] = ohms / 10e2 + "k";
    } else {
      r[0] = ohms + "";
    }

    int t = r.length < 4 ? 20 : r[3].equals("gold") ? 5 : 10;
    return String.format("%s ohms, %d%%", r[0], t).replaceAll("\\.0", "");
  }
}
