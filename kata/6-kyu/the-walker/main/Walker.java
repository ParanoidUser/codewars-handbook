import static java.lang.Math.*;

interface Walker {
  static int[] solve(int a, int b, int c, int alpha, int beta, int gamma) {
    var x = a * sin(PI * (90 - alpha) / 180) - b * sin(PI * beta / 180) - c * sin(PI * (90 - gamma) / 180);
    var y = a * sin(PI * alpha / 180) + b * sin(PI * (90 - beta) / 180) - c * sin(PI * gamma / 180);
    var dOC = sqrt(y * y + x * x);
    var tOC = 90 + 90 * (asin(abs(x) / dOC) / (PI / 2));

    int tOCd = (int) tOC;
    int tOCm = (int) ((tOC - tOCd) * 60);
    int tOCs = (int) ((((tOC - tOCd) * 60) - tOCm) * 60);

    return new int[] {(int) round(dOC), tOCd, tOCm, tOCs};
  }
}
