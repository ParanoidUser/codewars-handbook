class ZywOo
{
  static String warnTheSheep(String[] array)
  {
    int wolfN = java.util.Arrays.asList(array).indexOf("wolf") + 1;
    return wolfN == array.length ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + (array.length - wolfN) + "! You are about to be eaten by a wolf!";
  }
}