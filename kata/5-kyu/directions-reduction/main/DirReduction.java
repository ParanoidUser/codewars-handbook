interface DirReduction {
  static String[] dirReduc(String[] arr) {
    var optimal = "";
    for (var s : arr) {
      optimal = (optimal + "," + s).replace(",EAST,WEST", "").replace(",WEST,EAST", "").replace(",SOUTH,NORTH", "").replace(",NORTH,SOUTH", "");
    }
    return optimal.isEmpty() ? new String[0] : optimal.substring(1).split(",");
  }
}
