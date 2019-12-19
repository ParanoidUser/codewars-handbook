import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTestCases {
  @Test
  public void userTests() {
    AntiVirus AV = new AntiVirus();

    String[] intensity1signatures = new String[] {"malware", "virus", "infect"};

    String[] intensity2signatures =
        new String[] {
          "ransomware",
          "trojan",
          "trojanHorse",
          "worm",
          "spyware",
          "keystrokelogger",
          "adware",
          "botnet",
          "rootkit",
        };

    String[] intensity3signatures =
        new String[] {
          "DeleteSys32",
          "OverideMBR",
          "EncryptAll",
          "openrandomwebsite",
          "openrandwebsite",
          "sendalldata",
          "recordKeyboard",
          "recordmouse",
          "destroy",
          "overheat",
          "getfullcontrol",
          "uploadharddrive",
          "uploadharddisk",
          "overload",
          "changeOS",
          "encrypt",
          "changeDesktop",
          "ddos",
          "dos",
          "hide",
          "inject",
          "ransom",
          "getcreditcardinfo",
          "getpasswords",
          "getpass",
        };

    VirusDB DB = new VirusDB(intensity1signatures, intensity2signatures, intensity3signatures);

    File[] files = new File[4];

    files[0] = new File("file0", "qmesMJq1EAjBLPclDJVil3kmP3Bgj5qocZQnQuK0rGffyHvMCY");
    files[1] = new File("file1", "1OipRqMWEaZlviruse48XKWO2VLz40YMiC9x7FlUOsjg9");
    files[2] = new File("file2", "q4khFPhsPyWareRbxFZefTpN74cRr8Rh9b18Gtvbyz3");
    files[3] =
        new File(
            "file3", "ICqMYeVk6OoAIcI1dGl36AfKH1qyn2VywRjqxMVu6PFeuZyoaxdpaldPAdsdasGeTpASsReRdc");

    // defualt scanIntensity should be 0 - off so everything is safe.
    assertEquals(" ", "file0 is safe", AV.scanFile(files[0], DB));
    assertEquals(" ", "file1 is safe", AV.scanFile(files[1], DB));
    assertEquals(" ", "file2 is safe", AV.scanFile(files[2], DB));
    assertEquals(" ", "file3 is safe", AV.scanFile(files[3], DB));

    AV.setScanIntensity(1);
    assertEquals(" ", "file0 is safe", AV.scanFile(files[0], DB));
    assertEquals(" ", "file1 is not safe", AV.scanFile(files[1], DB));
    assertEquals(" ", "file2 is safe", AV.scanFile(files[2], DB));
    assertEquals(" ", "file3 is safe", AV.scanFile(files[3], DB));

    AV.setScanIntensity(2);
    assertEquals(" ", "file0 is safe", AV.scanFile(files[0], DB));
    assertEquals(" ", "file1 is not safe", AV.scanFile(files[1], DB));
    assertEquals(" ", "file2 is not safe", AV.scanFile(files[2], DB));
    assertEquals(" ", "file3 is safe", AV.scanFile(files[3], DB));

    AV.setScanIntensity(3);
    assertEquals(" ", "file0 is safe", AV.scanFile(files[0], DB));
    assertEquals(" ", "file1 is not safe", AV.scanFile(files[1], DB));
    assertEquals(" ", "file2 is not safe", AV.scanFile(files[2], DB));
    assertEquals(" ", "file3 is not safe", AV.scanFile(files[3], DB));
  }
}
