import java.util.Comparator;

class CatWeightComparator implements Comparator<Cat> {
  @Override
  public int compare(Cat cat1, Cat cat2) {
    return Double.compare(cat1.weight, cat2.weight);
  }
}
