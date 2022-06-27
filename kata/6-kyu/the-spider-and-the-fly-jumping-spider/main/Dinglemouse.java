interface Dinglemouse {
  static double spiderToFly(String spider, String fly) {
    int s = spider.charAt(1) - 48;
    int f = fly.charAt(1) - 48;
    return Math.sqrt(Math.pow(s, 2) + Math.pow(f, 2) - 2 * s * f * Math.cos(Math.toRadians(45. * Math.abs(spider.charAt(0) - fly.charAt(0)))));
  }
}
