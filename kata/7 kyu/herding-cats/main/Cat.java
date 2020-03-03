import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cat cat = (Cat) o;
    return Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, weight);
  }
}
