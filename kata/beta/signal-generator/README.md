# [Signal Generator](https://www.codewars.com/kata/signal-generator "https://www.codewars.com/kata/63ad55f4f278c4000f512d12")

A sine wave, sinusoidal wave, or just sinusoid is a mathematical curve defined in terms of the sine
trigonometric function, of which it is the graph. It is a type of continuous wave and also a smooth
periodic function. It occurs often in mathematics, as well as in physics, engineering, signal
processing and many other fields. More information [here](https://en.wikipedia.org/wiki/Sine_wave)

![sinus wave](https://upload.wikimedia.org/wikipedia/commons/b/b2/Sin.svg)

Basically, the reduced form of a wave takes the form

```math
y(t) = A sin (\omega t + \phi)
``` 

at where

* **A** is the amplitude,
* **omega** the angular frequency
* **phi** the phase

Given the three parameters and a ```time delay ```(`$ \delta t$`) return an Iterator that can
produces the signal plotted in intervals of  `$ \delta t$` truncate to 2 decimals

For example:

* A = 3 m
* `$ \omega $` = 2 rad/seg
* `$\phi$` = 0 rad
* `$\delta t$` = 0.1 s

produces

* i = 0 -> y(0.1) = 3* sin(2*0.1) = 0.59
* i = 1 -> y(0.2) = 3* sin(2*0.2) = 1.16
* i = 2 -> y(0.3) = 3* sin(2*0.3) = 1.69

Note:

* The iterator must be unbounded.
* Time interval must be positive.