interface TrainInspector {
  static int countMissingCarriages(String train) {
    return train.charAt(train.length() - 1) - train.length() - 64;
  }
}
