class SetBits {
  long eliminateUnsetBits(String number) {
    return (1L << number.replace("0", "").length()) - 1;
  }
}
