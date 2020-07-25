# [Texting with an old-school mobile phone](https://www.codewars.com/kata/texting-with-an-old-school-mobile-phone "https://www.codewars.com/kata/5ca24526b534ce0018a137b5")

If you're old enough, you might remember buying your first mobile phone, one of the old ones with no touchscreen, and sending your first text message with excitement in your eyes. Maybe you still have one lying in a drawer somewhere.

Let's try to remember the good old days and what it was like to send text messages with such devices. A lot of them had different layouts, most notably for special characters and spaces, so for simplicity we'll be using a fictional model with 3x4 key layout shown below:

```
-------------------------
|   1   |   2   |   3   |  <-- hold a key to type a number
|  .,?! |  abc  |  def  |  <-- press a key to type a letter
-------------------------
|   4   |   5   |   6   |  <-- Top row
|  ghi  |  jkl  |  mno  |  <-- Bottom row
-------------------------
|   7   |   8   |   9   |
|  pqrs |  tuv  |  wxyz |
-------------------------
|   *   |   0   |   #   |  <-- hold for *, 0 or #
|  '-+= | space |  case |  <-- press # to switch between upper/lower case
-------------------------
```

You got your thumb ready to go, so you'll receive a ```message``` and your job is to figure out which keys you need to press to output the given message with ***the lowest number of clicks possible***. 
Return the result as a string of key inputs from top row (refer to diagram above).

***Take your time*** to study the rules below.

## How it works

Output string contains inputs that are shown at the **top** row of a key's layout. (`0-9*#`)

## Typing letters

To type letters, press a button repeatedly to cycle through the possible characters (bottom row of a key's layout). Pressing is represented by key's top row element repeated `n` times, where n is the position of character on that particular key. Examples: 
- ```2``` => 'a', ```9999``` => 'z', ```111``` => '?', ```***``` => '+'

## Typing numbers

To type numbers ```0-9``` and special characters ```*#``` - hold that key. Holding is represented by a number, followed by a dash. Examples:
- ```3-``` => '3', ```5-5-5-``` => '555'

## Uppercase / Lowercase

Initially the case is `lowercase`. To ***toggle*** between lowercase and uppercase letters, use the ```#``` symbol. Case switching should only be considered when next character is alphabetic (`a-z`). Examples:
- ```#2#9999``` => 'Az' (remember, it's a toggle)
- ```27-#2255``` => 'a7BK' (do not switch before '7')

## Waiting for next character

If you have 2 or more characters in a sequence that reside on the same button (refer to layout, bottom row), you have to ***wait*** before pressing the same button again. 
Waiting is represented by adding a **space** between 2 (or more) such characters. Example:
- ```44 444 44 444``` => 'hihi' 

**Exceptions**: No need to wait **after holding** any key, even if next character resides on same button (```4-4``` => '4g'), or if there's a case switch between 2 characters on same button (```#5#55``` => 'Jk').

## Example

To put it all together, let's go over an example.
Say you want to type this message - ```'Def Con 1!'```:
- Switch to uppercase with ```#``` and press ```3``` (```#3 => D```) (input is now in uppercase mode)
- Switch to lowercase and press ```3``` twice (```#33 => e```). (Note that there is no **waiting** because of case switching)
- Next character ```f``` is on button ```3``` again, and has the same case (lowercase input and lowercase character), so you have to wait to type again (```' 333' => f```).
- In a similar manner type the second word (space is located on number ```0```). ```0#222#666 66 => ' Con'```
- Finish off by holding ```1``` as ```1-``` and typing ```!``` as ```1111``` (```'1-1111' = 1!```). Note that after holding a key you don't need to wait to press another key.

## Result: 

```
sendMessage("Def Con 1!") => "#3#33 3330#222#666 6601-1111" 
```

More examples are provided in sample test suite.

All inputs will be valid strings and only consist of characters from the key layout table.