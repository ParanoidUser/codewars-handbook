interface EightiesKids5 {
  static String bucketOf(String said) {
    var water = said.toLowerCase().matches(".*(water|wet|wash).*");
    var slime = said.toLowerCase().matches(".*(don't know|slime).*");
    return water && slime ? "sludge" : water ? "water" : slime ? "slime" : "air";
  }
}
