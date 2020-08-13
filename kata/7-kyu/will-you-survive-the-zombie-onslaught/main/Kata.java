interface Kata {
  static String zombieShootout(int z, int r, int a) {
    return "You shot " + (z > (r *= 2) || z > a ? Math.min(a, r) + " zombies before being eaten: " + (a < r ? "ran out of ammo." : "overwhelmed.") : "all " + z + " zombies.");
  }
}
