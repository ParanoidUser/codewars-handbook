import java.util.LinkedHashMap;

class Dinglemouse extends LinkedHashMap<String, String> {
  Dinglemouse setAge(int age) {
    put("age", " I am " + age + ".");
    return this;
  }

  Dinglemouse setSex(char sex) {
    put("sex", sex == 'M' ? " I am male." : " I am female.");
    return this;
  }

  Dinglemouse setName(String name) {
    put("name", " My name is " + name + ".");
    return this;
  }

  String hello() {
    return "Hello." + String.join("", values());
  }
}
