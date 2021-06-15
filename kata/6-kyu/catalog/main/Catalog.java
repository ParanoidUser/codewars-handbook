import java.util.ArrayList;

interface Catalog {
  static String catalog(String s, String article) {
    var search = new ArrayList<String>();
    for (var art : s.split("\n\n")) {
      var name = art.substring(art.indexOf("<name>") + 6, art.indexOf("</name>"));
      if (name.contains(article)) {
        var prx = art.substring(art.indexOf("<prx>") + 5, art.indexOf("</prx>"));
        var qty = art.substring(art.indexOf("<qty>") + 5, art.indexOf("</qty>"));
        search.add(String.format("%s > prx: $%s qty: %s", name, prx, qty));
      }
    }
    return search.isEmpty() ? "Nothing" : String.join("\n", search);
  }
}
