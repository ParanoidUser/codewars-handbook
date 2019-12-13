public class Cat implements Comparable<Cat> {
  String name;
  double weight;

  public Cat(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  @Override
  public int compareTo(Cat c) {
    return this.name.compareTo(c.name);
  }
}
