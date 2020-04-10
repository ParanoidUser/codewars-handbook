# [Find Email Domain](https://www.codewars.com/kata/find-email-domain "https://www.codewars.com/kata/5a5961f7145c46e6420000d7")

An email address such as ```"John.Smith@example.com"``` is made up of a local part (```"John.Smith"```), an ```"@"``` symbol, then a domain part (```"example.com"```).

The domain name part of an email address may only consist of letters, digits, hyphens and dots. The local part, however, also allows a lot of different special characters.

Given a valid email address, find its ```domain``` part.

**Examples**

For ```address = "prettyandsimple@example.com"```, the output should be
```findEmailDomain(address) = "example.com"```;<br><br>
For ```address = "<>[]:,;@\"!#$%&*+-/=?^_{}| ~.a\"@example.org"```, the output should be 
```findEmailDomain(address) = "example.org"```.