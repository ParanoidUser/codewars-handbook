package com.codewars.geoffp;

interface UnwantedDollars {
  static double moneyValue(String money) {
    money = money.replaceAll("[$ ]", "");
    return money.isEmpty() || money.equals("-") ? 0 : Double.parseDouble(money);
  }
}
