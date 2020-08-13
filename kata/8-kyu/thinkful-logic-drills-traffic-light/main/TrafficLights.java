interface TrafficLights {
  static String updateLight(String current) {
    return current.equals("green") ?  "yellow" : current.equals("yellow") ? "red" : "green";
  }
}
