import java.util.Objects;

class Cat implements Comparable<Cat> {
  final String name;
  final double weight;

  Cat(String name, double weight) {
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
    if (!(o instanceof Cat cat)) {
      return false;
    }
    return Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, weight);
  }
}