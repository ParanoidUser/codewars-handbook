class Lamp {
  private String color;
  private String state;

  public Lamp(String color, String state) {
    this.color = color;
    this.state = state;
  }

  String getColor() {
    return color;
  }

  void setColor(String color) {
    this.color = color;
  }

  String getState() {
    return state;
  }

  void setState(String state) {
    this.state = state;
  }
}
