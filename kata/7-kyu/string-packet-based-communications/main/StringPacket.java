interface StringPacket {
  static String communicationModule(String p) {
    var a = Integer.parseInt(p.substring(8, 12));
    var b = Integer.parseInt(p.substring(12, 16));
    var i = p.substring(4, 8);
    a += "0F12".equals(i) ? b : "B7A2".equals(i) ? -b : --b * a;
    return String.format("%sFFFF%04d0000%s", p.substring(0, 4), Math.max(0, Math.min(9999, a)), p.substring(16));
  }
}
