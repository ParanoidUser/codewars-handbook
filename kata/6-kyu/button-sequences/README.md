# [Button sequences](https://www.codewars.com/kata/button-sequences "https://www.codewars.com/kata/5bec507e1ab6db71110001fc")

I have started studying electronics recently, and I came up with a circuit made up of 2 LEDs and 3 buttons.

Here 's how it works: 2 buttons (`red` and `blue`) are connected to the LEDs (`red` and `blue` respectively). Buttons pressing pattern will be remembered and represented through the LEDs when the third button is pressed.

 - Only one LED can blink at a time.
 - The LED will only blink once even if the button is held down.
 - The button must be released to be pressed again.
 - If a button is pressed while the other button is being held down, it will be ignored.
 - If two buttons are pressed simultaneously, the red button will be preferred.
 - If a button is released while the other is being held down, the other 's LED will blink.
 - `0` is up and `1` is down.
 - The two inputs will always have the same length.
 
Here is an example:

```
Red:  "10011010"
Blue: "10110111"
#=> "RBRB"

Red:  "01001000"
Blue: "01011100"
#=> "RB"

Red:  "01101000"
Blue: "00111000"
#=> "RB"
```