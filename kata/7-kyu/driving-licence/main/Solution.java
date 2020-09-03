import java.util.List;

interface Solution {
  static String driver(String[] data) {
    int m = List.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec").indexOf(data[3].substring(3, 6)) + 1;
    var license = data[2].length() < 5 ? data[2] + "9".repeat(5 - data[2].length()) : data[2].substring(0, 5);
    license += data[3].charAt(data[3].lastIndexOf('-') + 3);
    license += data[4].charAt(0) == 'F' ? m + 50 : m < 10 ? "0" + m : m;
    license += data[3].substring(0, 2) + data[3].charAt(data[3].length() - 1);
    license += data[0].charAt(0);
    license += data[1].isEmpty() ? "9" : data[1].charAt(0);
    return (license + "9AA").toUpperCase();
  }
}
