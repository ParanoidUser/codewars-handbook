class Animal {
  protected final String name;

  Animal(String name) {
    this.name = name;
  }

  public String speak() {
    return this.name + " makes a noise.";
  }
}