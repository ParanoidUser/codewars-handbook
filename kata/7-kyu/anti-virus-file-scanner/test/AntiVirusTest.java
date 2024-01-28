import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AntiVirusTest {
  private VirusDB db;

  @BeforeEach
  void setUp() {
    var intensity1signatures = new String[]{"malware", "virus", "infect"};
    var intensity2signatures = new String[]{"ransomware", "trojan", "trojanHorse", "worm", "spyware", "keystrokelogger", "adware", "botnet", "rootkit"};
    var intensity3signatures = new String[]{"DeleteSys32", "OverideMBR", "EncryptAll", "openrandomwebsite", "openrandwebsite", "sendalldata", "recordKeyboard", "recordmouse", "destroy", "overheat", "getfullcontrol", "uploadharddrive", "uploadharddisk", "overload", "changeOS", "encrypt", "changeDesktop", "ddos", "dos", "hide", "inject", "ransom", "getcreditcardinfo", "getpasswords", "getpass"};
    db = new VirusDB(intensity1signatures, intensity2signatures, intensity3signatures);
  }

  @Test
  void sample() {
    var f1 = new File("file0", "qmesMJq1EAjBLPclDJVil3kmP3Bgj5qocZQnQuK0rGffyHvMCY");
    var f2 = new File("file1", "1OipRqMWEaZlviruse48XKWO2VLz40YMiC9x7FlUOsjg9");
    var f3 = new File("file2", "q4khFPhsPyWareRbxFZefTpN74cRr8Rh9b18Gtvbyz3");
    var f4 = new File("file3", "ICqMYeVk6OoAIcI1dGl36AfKH1qyn2VywRjqxMVu6PFeuZyoaxdpaldPAdsdasGeTpASsReRdc");

    AntiVirus av = new AntiVirus();
    assertEquals("file0 is safe", av.scanFile(f1, db));
    assertEquals("file1 is safe", av.scanFile(f2, db));
    assertEquals("file2 is safe", av.scanFile(f3, db));
    assertEquals("file3 is safe", av.scanFile(f4, db));

    av.setScanIntensity(1);
    assertEquals("file0 is safe", av.scanFile(f1, db));
    assertEquals("file1 is not safe", av.scanFile(f2, db));
    assertEquals("file2 is safe", av.scanFile(f3, db));
    assertEquals("file3 is safe", av.scanFile(f4, db));

    av.setScanIntensity(2);
    assertEquals("file0 is safe", av.scanFile(f1, db));
    assertEquals("file1 is not safe", av.scanFile(f2, db));
    assertEquals("file2 is not safe", av.scanFile(f3, db));
    assertEquals("file3 is safe", av.scanFile(f4, db));

    av.setScanIntensity(3);
    assertEquals("file0 is safe", av.scanFile(f1, db));
    assertEquals("file1 is not safe", av.scanFile(f2, db));
    assertEquals("file2 is not safe", av.scanFile(f3, db));
    assertEquals("file3 is not safe", av.scanFile(f4, db));

    av.setScanIntensity(30);
    assertEquals("file0 is safe", av.scanFile(f1, db));
    assertEquals("file1 is not safe", av.scanFile(f2, db));
    assertEquals("file2 is not safe", av.scanFile(f3, db));
    assertEquals("file3 is not safe", av.scanFile(f4, db));
  }
}