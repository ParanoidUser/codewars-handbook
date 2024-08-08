# [Conversion between Kilobyte and KibiByte](https://www.codewars.com/kata/conversion-between-kilobyte-and-kibibyte "https://www.codewars.com/kata/5a115ff080171f9651000046")

**Background**

You most probably know, that the *kilo* used by IT-People differs from the
*kilo* used by the rest of the world. Whereas *kilo* in kB is (mostly) interpreted as 1024 Bytes (especially by
operating systems) the non-IT *kilo* denotes the factor 1000 (as in "1 kg is 1000g"). The same goes for the prefixes
mega, giga, tera, peta and so on.
To avoid misunderstandings (like your hardware shop selling you a 1E+12 Byte hard disk as 1 TB, whereas your Windows
states that it has only 932 GB, because the shop uses factor 1000 whereas operating systems use factor 1024 by default)
the International Electrotechnical Commission has proposed to use **kibibyte** for 1024 Byte.The according unit symbol
would be **KiB**. Other Prefixes would be respectively:

```
1 MiB = 1024 KiB   
1 GiB = 1024 MiB   
1 TiB = 1024 GiB     
```

**Task**

Your task is to write a conversion function between the kB and the KiB-Units. The function receives as parameter a
memory size including a unit and converts into the corresponding unit of the other system:

```
memorysizeConversion ( "10 KiB") -> "10.24 kB"   
memorysizeConversion ( "1 kB") -> "0.977 KiB"   
memorysizeConversion ( "10 TB") -> "9.095 TiB"   
memorysizeConversion ( "4.1 GiB") -> "4.402 GB"   
```

**Hints**

- the parameter always contains a (fractioned) number, a whitespace and a valid unit
- units are case-sensitive, valid units are **kB MB GB TB KiB MiB GiB TiB**
- result must be rounded to 3 decimals (round half up,no trailing zeros) see examples above

**Resources**
If you want to read more on ...ibi-Units:  
https://en.wikipedia.org/wiki/Kibibyte
