interface Kata {
  static String longToIP(long ip) {
    return (ip >>> 24) + "." + (ip >> 16 & 255) + "." + (ip >> 8 & 255) + "." + (ip & 255);
  }
}