interface Circuit {
  static String ledSeq(String redSeq, String blueSeq) {
    var blinks = new StringBuilder();
    int red;
    int blue;
    for (int i = 0, prevRed = '0', prevBlue = '0'; i < redSeq.length(); i++, prevRed = red, prevBlue = blue) {
      red = redSeq.charAt(i);
      blue = blueSeq.charAt(i);

      boolean buttonPressed = prevRed + prevBlue == '0' + '0' && red + blue > '0' + '0';
      boolean buttonReleased = prevRed + prevBlue == '1' + '1' && red + blue == '1' + '0' && blinks.charAt(blinks.length() - 1) != (red == '1' ? 'R' : 'B');
      boolean buttonSwitched = red + blue == '0' + '1' && prevRed == blue && prevBlue == red;

      if (buttonReleased || buttonPressed || buttonSwitched) {
        blinks.append(red == '1' ? 'R' : 'B');
      }
    }
    return blinks.toString();
  }
}
