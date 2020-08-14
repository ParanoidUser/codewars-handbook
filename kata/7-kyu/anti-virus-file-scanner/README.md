# [Anti-virus file scanner](https://www.codewars.com/kata/anti-virus-file-scanner "https://www.codewars.com/kata/5b13027eedd62c5216000001")

You are working for NoVirus Security Solutions and they ask you to make a scanner that scans a file inputted by the user with the function `scanFile(File,VirusDB)` that takes a <Strong>File</Strong> and a <Strong>VirusDB</Strong> object and return whether a file is safe or not. Remember: the searches need to be non-Case-Sensitive

Your class also has the function `setScanIntensity(int)` which changes the scan intensity. This will only receive values 0, 1, 2 or 3. This has been done for you.

The scan intensity determines the arrays from the database that will be used. i.e.:
<ul>
  <li>scanIntensity 0 means off(every file is considered safe)</li>
  <li>scanIntensity 1 means that only the array intensity1Signatures will be used</li>
  <li>scanIntensity 2 means that the arrays intensity1Signatures and intensity2Signatures will be used</li>
  <li>scanIntensity 3 means that all 3 arrays will be used</li>
</ul>

## Outputs

The outputs should be:
```"Filename is safe"``` or ```"Filename is not safe"``` (Filename is the name of the file that you can get with `file.getName()` )

## Examples

```
      String[] intensity1signatures = new String[]{
        "malware",
        "virus",
        "infect"
      };
      
      String[] intensity2signatures = new String[]{
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
      
      String[] intensity3signatures = new String[]{
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
```


<table>
  <tr>
    <th>file name</th>
    <th>file data</th>
    <th>scan
    intensity</th>
    <th>result</th>
    <th>comments</th>
  </tr>
  <tr>
    <td>file0</td>
    <td>dsadxzdc<strong>Virus</strong>dsadfads</td>
    <td>0</td>
    <td>"file0 is safe"</td>
    <td>scanIntensity 0 means off</td>
  </tr>
  <tr>
    <td>file1</td>
    <td>dsadxzdc<strong>ViRUs</strong>dsadfads</td>
    <td>1</td>
    <td>"file1 is not safe"</td>
    <td>make sure that the scan is not case sensitive</td>
  </tr>
  <tr>
    <td>Virus</td>
    <td>dsadxz2346dsadfads</td>
    <td>3</td>
    <td>"Virus is safe"</td>
    <td>Name doesn't matter</td>
  </tr>
  <tr>
    <td>file4</td>
    <td>gasfdsf<strong>worm</strong>hmilasd</td>
    <td>1</td>
    <td>"file4 is safe"</td>
    <td>worm is in array 2 while the intensity was 1, so 2 shall not be searched</td>
  </tr>
  <tr>
    <td>file5</td>
    <td>asc<strong>gEtCReditcaRdiNFo</strong>lds</td>
    <td>3</td>
    <td>"file5 is not safe"</td>
    <td>getcreditcardinfo is int array 3</td>
  </tr>
</table>