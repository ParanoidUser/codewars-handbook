interface Kata {
  static String sendMessage(String message) {
    var keymap = new String[]{"0", "1111", "", "#-", "", "", "", "*", "", "", "*-", "***", "11", "**", "1", "", "0-", "1-", "2-", "3-", "4-", "5-", "6-", "7-", "8-", "9-", "", "", "", "****", "", "111", "", "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7", "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999"};
    var low = true;
    var keys = new StringBuilder();
    for (char c : message.toCharArray()) {
      if (Character.isLowerCase(c) && !low || Character.isUpperCase(c) && low) {
        keys.append("#");
        low = !low;
      }
      var key = keymap[Character.toUpperCase(c) - ' '];
      keys.append(!keys.isEmpty() && keys.charAt(keys.length() - 1) == key.charAt(0) ? " " : "").append(key);
    }
    return keys.toString();
  }
}