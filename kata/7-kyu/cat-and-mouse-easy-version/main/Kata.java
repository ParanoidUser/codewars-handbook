interface Kata{
  static String catMouse(String x){
    return x.length() > 5 ? "Escaped!" : "Caught!";
  }
}