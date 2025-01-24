# [Zeta Swap](https://www.codewars.com/kata/zeta-swap "https://www.codewars.com/kata/6780126afa635e648148397e")

Hello Detective! The Ministry of Magic has suddenly fallen while we were in the middle of our annual Tetrawizard Tournament. A murder has
been spotted within the chambers of Slytherin. Our only witness is Ron. But, as you know, Ron was preoccupied with Lavendar while it
happened. He is unsure what letter he saw on the back of the coats of the suspects since he reads right to left.

Your task is to implement a function that takes a string and swaps each letter with its "opposite" in the alphabet (e.g., 'a' ↔ 'z', 'b' ↔ 'y', etc.),
but only if the letter occurs more than once in the string.

- Non-alphabet characters (e.g., numbers, punctuation, whitespace) should remain unchanged.
- The function should preserve the case of the letters (e.g., 'A' ↔ 'Z', 'b' ↔ 'y').
- Single-occurrence letters are not swapped.

Input

- A string containing alphabetic and non-alphabetic characters.
- Length of the string: 0 ≤ length ≤ 10^5.

Output

- A string with swapped letters where applicable, and all other characters unchanged.