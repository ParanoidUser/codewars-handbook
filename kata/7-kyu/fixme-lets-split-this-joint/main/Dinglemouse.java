interface Dinglemouse {
  static String[] split(String joint) {
    return joint.isEmpty() ? new String[0] : joint.split("\\.", -1);
  }
}
