# [Decoding a logic transmission](https://www.codewars.com/kata/decoding-a-logic-transmission "https://www.codewars.com/kata/5e477a54406d360001bc10f6")

A square wave signal gets sampled and stored in an ```array of doubles``` where each element represents the read value at the sampled point.

The sample frequency is exactly the same as the signal frequency with a 50% trigger offset
(Meaning that the read value always lines up with the bits position in the transmission)

A 12 bit signal looks like this:

```
ˍˍˍ|ˉˉˉ|ˍˍˍˍˍˍ|ˉˉˉ|ˍˍˍ|ˉˉˉˉˉˉˉˉˉ|ˍˍˍˍˍˍ|ˉˉˉ

 ˸   ˸   ˸
 ```
A colon represents a sample (as stated its always lined up with the signal)

A logic ```HIGH``` has a value of ```5.0```

A logic ```LOW``` has a value of ```1.0```

The signals ```noise``` is ```+-0.2```

Your first task is converting the signal to its binary form.
For example

```{0.94, 1.02, 5.01, 0.99, 5.12, 4.89}``` -> ```001011```

Now we need to interpret the transmission.
The packets are sent with the most significant bit (MSB) first and
are ```unsigned``` (meaning no extra bit that specifies negative numbers)
So a ```0010``` -> ```2``` or ```0110``` -> ```6```

Every transmission starts with a ```4 bit``` packet that determines the length of every following packet.

So a transmission with a packet length of ```6 bit``` might look like this:
```0100 011011 010010 100001```

Resulting in int representation of ```{27, 18, 33}``` which will be our return value.

NOTE:
You will not be given invalid signals with values outside the HIGH/LOW +- noise range.


```
1) Signal to binary
2) Determine packet size
3) Packets to int array
```