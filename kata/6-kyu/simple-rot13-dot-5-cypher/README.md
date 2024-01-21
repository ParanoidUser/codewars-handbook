# [Simple ROT13.5 cypher](https://www.codewars.com/kata/simple-rot13-dot-5-cypher "https://www.codewars.com/kata/5894986e2ddc8f6805000036")

You are asked to write a simple cypher that rotates every character (in range [a-zA-Z], special chars will be ignored by
the cypher) by 13 chars. As an addition to the original ROT13 cypher, this cypher will also cypher numerical
digits ([0-9]) with 5 chars.

Example:

    "The quick brown fox jumps over the 2 lazy dogs"

will be cyphered to:

    "Gur dhvpx oebja sbk whzcf bire gur 7 ynml qbtf"

Your task is to write a ROT13.5 (ROT135) method that accepts a string and encrypts it.
Decrypting is performed by using the same method, but by passing the encrypted string again.

Note: when an empty string is passed, the result is also empty.