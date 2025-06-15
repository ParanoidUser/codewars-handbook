class Cat extends Animal {
  Cat(String name) {
    super(name);
  }

  @Override
  public String speak() {
    return "%s meows.".formatted(this.name);
  }
}