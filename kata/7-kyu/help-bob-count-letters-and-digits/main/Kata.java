interface Kata{
  static int countLettersAndDigits(String input){
    return input.replaceAll("[^a-zA-Z\\d]+", "").length();
  }
}