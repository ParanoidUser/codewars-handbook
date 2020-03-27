# [Ancestors Blowfish - play with bits](https://www.codewars.com/kata/ancestors-blowfish-play-with-bits "https://www.codewars.com/kata/587510553793a30f640000ff")

Blowfish is an old & complex encryption algorithm.

we took few elements from it to create our own simple version of this algorithm.

our encryption method should get 2 Strings - plainText and password. which can be any string.

the encryption algorithm: we are doing *special XOR* between every char of the plainText with the parallel char of the password - if the password is shorter than the plainText then it runs in a loop and start over from it's first char. (example: plain text:\"ab\", password:\"a\" -> we should do 'a' special XOR 'a', 'b' special XOR 'a')

Special XOR = doing XOR between 2 chars only that the second char's first 8 bits(from the left) are swapped with it's last 8 bits(the right ones). for example:
special XOR of 2 chars(bits representing) -> 1100110010101010 with 0001110011100111 is actually 1100110010101010 XOR 1110011100011100.

the second char was 0001110011100111 - so we swapped it's bits to 1110011100011100