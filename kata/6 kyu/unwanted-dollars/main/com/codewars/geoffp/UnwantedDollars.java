package com.codewars.geoffp;

class UnwantedDollars {
  static double moneyValue(String money) {
    return (money = money.replaceAll("[$ ]", "")).isEmpty() || money.equals("-") ? 0 : Double.parseDouble(money);
  }
}
