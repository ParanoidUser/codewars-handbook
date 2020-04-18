# [Weton](https://www.codewars.com/kata/weton "https://www.codewars.com/kata/5daf34afe1201700121ed17e")

<H1>Weton</H1>
Javanese have five days. They call it <b>Pasaran</b>. Those five days are written in order:
<ol style="color: lightgreen;">
<li>Pahing</li>
<li>Pon</li>
<li>Wage</li>
<li>Kliwon</li>
<li>Legi</li>
</ol>

It will be changed each time the day changed. For example if today is <b style="color:red;">Pahing</b>, then tomorrow will be <b style="color:red;">Pon</b> and yesterday must be <b style="color:red;">Legi</b>.

Javanese also use normal day <b style="color: lightgreen;">"Dina"</b> in their language. Here the name of the days in Javanese:
<ol style="color: lightgreen;">
<li>Minggu <i style="color: yellow;">(Sunday)</i></li>
<li>Senin <i style="color: yellow;">(Monday)</i></li>
<li>Selasa <i style="color: yellow;">(Tuesday)</i></li>
<li>Rebo <i style="color: yellow;">(Wednesday)</i></li>
<li>Kemis <i style="color: yellow;">(Thursday)</i></li>
<li>Jemuwah <i style="color: yellow;">(Friday)</i></li>
<li>Setu <i style="color: yellow;">(Saturday)</i></li>
</ol>

Your task is to convert the conventional date to Javanese format which is combination between normal day names and five day names for example: <b style="color:red;">Kemis Pon</b>, <b style="color:red;">Selasa Pahing</b>, <b style="color:red;">Rebo Wage</b>, etc. This combination in Javanese called <b style="color: lightgreen;">Weton</b>.

The conventional format could be full date or numeric date:
```
1. October 22, 2019
2. 22 October 2019
3. 22 October, 2019
4. 10/22/2019
5. 2019-10-22
```

I will give you the clue for today, ```October 23, 2019``` will give a result ```Rebu Wage```.