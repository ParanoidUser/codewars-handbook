interface God {
  static Human[] create() {
    return new Human[] {new Man(), new Woman()};
  }
}

interface Human {}

class Man implements Human {}

class Woman implements Human {}
