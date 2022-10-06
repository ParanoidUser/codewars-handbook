# [Sexagesimal degree](https://www.codewars.com/kata/sexagesimal-degree "https://www.codewars.com/kata/5e888f493e8d20001f744935")

There are different geocoordinate systems. One of the best known is WGS 84, which is used for GPS coordinates, for example. Here the world is divided into longitude and latitude. The representation of the coordinates can be in decimal degrees and in sexagesimal degrees. The task is: convert the coordinates from decimal degree to sexagesimal degree. If an invalid coordinate is passed, raise/throw an exception.

# Symbols
* Degrees: °
* Minutes: ′
* Seconds: ″
* Orientations: N, S, W, E

# Examples

* **La Tour Eiffel**<br/>
lat=48.858222, lon=2.2945 -> 48° 51′ 30″ N, 2° 17′ 40″ E
* **Sydney Opera House**<br/>
lat=-33.856111, lon=151.215278 -> 33° 51′ 22″ S, 151° 12′ 55″ E
* **Statue of Liberty**<br/>
lat=40.68923, lon=-74.04447 -> 40° 41′ 21″ N, 74° 2′ 40″ W