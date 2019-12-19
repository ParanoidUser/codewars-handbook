class File {
  private String name;
  private String data;

  File(String name, String data) {
    this.name = name;
    this.data = data;
  }

  public String getName() {
    return this.name;
  }

  public String getData() {
    return this.data;
  }
}
