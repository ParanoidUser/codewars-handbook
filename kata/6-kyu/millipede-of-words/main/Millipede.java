  interface Millipede {
    static boolean check(String[] millipede) {
      StringBuilder joined = new StringBuilder(millipede[0]);
      millipede[0] = "-";
      for (int i = 0; i < millipede.length / 2; i++) {
        for (int j = 1; j < millipede.length; j++) {
          if (joined.charAt(joined.length() - 1) == millipede[j].charAt(0)) {
            joined.append(millipede[j]);
            millipede[j] = "-";
          } else if (joined.charAt(0) == millipede[j].charAt(millipede[j].length() - 1)) {
            joined.insert(0, millipede[j]);
            millipede[j] = "-";
          }
        }
      }
      return String.join("-", millipede).matches("-+");
    }
  }