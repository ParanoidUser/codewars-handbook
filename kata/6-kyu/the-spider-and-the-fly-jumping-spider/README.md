# [The Spider and the Fly (Jumping Spider)](https://www.codewars.com/kata/the-spider-and-the-fly-jumping-spider "https://www.codewars.com/kata/5a30e7e9c5e28454790000c1")

A spider web is defined by

* "rings" numbered out from the centre as `0`, `1`, `2`, `3`, `4`
* "radials" labelled clock-wise from the top as `A`, `B`, `C`, `D`, `E`, `F`, `G`, `H`

Here is a picture to help explain:

![](https://i.imgur.com/tGeWQVq.png)

## Web Coordinates

As you can see, each point where the rings and the radials intersect can be described by a "web
coordinate".

So in this example the spider is at `H3` and the fly is at `E2`

## Task

Our friendly jumping spider is resting and minding his own spidery business at
web-coordinate `spider`.

An inattentive fly bumbles into the web at web-coordinate `fly` and gets itself stuck.

Your task is to calculate and return <span style='color:orange; font-weight:bold; font-size:1.1em;'>
**the
distance**</span> the spider must jump to get to the fly.

## Example

The solution to the scenario described by the picture is ``4.63522``

## Notes

* The centre of the web will always be referred to as `A0`
* The rings intersect the radials at **evenly** spaced distances of **1 unit**