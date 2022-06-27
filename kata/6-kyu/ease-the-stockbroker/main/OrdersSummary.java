import java.util.ArrayList;

interface OrdersSummary {
  static String balanceStatements(String lst) {
    var typos = new ArrayList<String>();
    double bought = 0;
    double sold = 0;
    for (String order : lst.split(", ")) {
      if (order.matches("^.*?(\\d+) (\\d*\\.\\d+) ([BS])$")) {
        String[] simple = order.split(" ");
        double price = Integer.parseInt(simple[1]) * Double.parseDouble(simple[2]);
        if (simple[3].equals("B")) {
          bought += price;
        } else {
          sold += price;
        }
      } else {
        typos.add(order + " ;");
      }
    }
    return "Buy: " + Math.round(bought) + " Sell: " + Math.round(sold)
        + (typos.isEmpty() || lst.isEmpty() ? "" : "; Badly formed " + typos.size() + ": " + String.join("", typos));
  }
}
