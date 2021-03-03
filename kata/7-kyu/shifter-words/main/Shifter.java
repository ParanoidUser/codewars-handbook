import static java.util.stream.Stream.of;

interface Shifter {
  static int count(String st) {
    return (int) of(st.split(" ")).distinct().filter(w -> w.matches("[HIMNOSWXZ]+")).count();
  }
}