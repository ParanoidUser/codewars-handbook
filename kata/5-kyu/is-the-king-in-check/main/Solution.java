import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

interface Solution {
  static boolean isTheKinginCheck(char[][] chessboard) {
    return of(chessboard).map(String::valueOf).collect(joining("_")).matches(".*(" +
        /* ♟   */ "P(?<!_.).{7}K|P(?!_).{9}K|" +
        /* ♛♜ */ "[QR] *K|K *[QR]|[QR](.{8} )*.{8}K|K(.{8} )*.{8}[QR]|" +
        /* ♛♝ */ "[QB]((?<!_.).{7} )*(?<!_).{7}K|K((?<!_.).{7} )*(?<!_).{7}[QB]|[QB]((?!_).{9} )*(?!_).{9}K|K((?!_).{9} )*(?!_).{9}[QB]|" +
        /* ♞   */ "N(?<!_.|_..)(?![^_]{6}).{6}K|K(?<!_.|_..)(?![^_]{6}).{6}N|N(?!_|._).{10}K|K(?!_|._).{10}N|N(?<!_.).{16}K|K(?<!_.).{16}N|N(?!_).{18}K|K(?!_).{18}N).*");
  }
}