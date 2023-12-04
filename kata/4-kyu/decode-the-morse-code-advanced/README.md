# [Decode the Morse code, advanced](https://www.codewars.com/kata/decode-the-morse-code-advanced "https://www.codewars.com/kata/54b72c16cd7f5154e9000457")

In this kata you have to write a <a href="https://en.wikipedia.org/wiki/Morse_code">Morse code</a>
decoder for <a href="https://en.wikipedia.org/wiki/Electrical_telegraph">wired electrical
telegraph</a>.

Electric telegraph is operated on a 2-wire line with a key that, when pressed, connects the wires
together, which can be detected on a remote station. The Morse code encodes every character being
transmitted as a sequence of "dots" (short presses on the key) and "dashes" (long presses on the
key).

When transmitting the Morse code, the international standard specifies that:
<ul><li>"Dot" – is 1 time unit long.</li>
<li>"Dash" – is 3 time units long.</li>
<li>Pause between dots and dashes in a character – is 1 time unit long.</li>
<li>Pause between characters inside a word – is 3 time units long.</li>
<li>Pause between words – is 7 time units long.</li></ul>

However, the standard does not specify how long that "time unit" is. And in fact different operators
would transmit at different speed. An amateur person may need a few seconds to transmit a single
character, a skilled professional can transmit 60 words per minute, and robotic transmitters may go
way faster.

For this kata we assume the message receiving is performed automatically by the hardware that checks
the line periodically, and if the line is connected (the key at the remote station is down), <code>
1</code> is recorded, and if the line is not connected (remote key is up), <code>0</code> is
recorded. After the message is fully received, it gets to you for decoding as a string containing
only symbols <code>0</code> and <code>1</code>.

For example, the message <code>HEY JUDE</code>, that is <code>···· · −·−− ·−−− ··− −·· ·</code> may
be received as follows:

```
1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011
```

As you may see, this transmission is perfectly accurate according to the standard, and the hardware
sampled the line exactly two times per "dot".

That said, your task is to implement two functions:

1. Function <code>decodeBits(bits)</code>, that should find out the transmission rate of the
   message, correctly decode the message to dots <code>.</code>, dashes <code>-</code> and spaces (
   one between characters, three between words) and return those as a string. Note that some
   extra <code>0</code>'s may naturally occur at the beginning and the end of a message, make sure
   to ignore them. Also if you have trouble discerning if the particular sequence of <code>1</code>'
   s is a dot or a dash, assume it's a dot.

2. Function <code>decodeMorse(morseCode)</code>, that would take the output of the previous function
   and return a human-readable string.

**NOTE:** For coding purposes you have to use ASCII characters `.` and `-`, not Unicode characters.

The Morse code table is preloaded for you (see the solution setup, to get its identifier in your
language).

```
Eg:
  morseCodes(".--") // to access the morse translation of ".--"
```

All the test strings would be valid to the point that they could be reliably decoded as described
above, so you may skip checking for errors and exceptions, just do your best in figuring out what
the message is!