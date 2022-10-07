package com.codewars.running;

interface RunningPace {
  static String calculate(double distance, String time) {
    var mmss = time.split(":");
    int duration = 60 * Integer.parseInt(mmss[0]) + Integer.parseInt(mmss[1]);
    int velocity = (int) (duration / distance);
    return String.format("%d:%02d", velocity / 60, velocity % 60);
  }
}