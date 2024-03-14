# [Trilingual democracy](https://www.codewars.com/kata/trilingual-democracy "https://www.codewars.com/kata/62f17be8356b63006a9899dc")

Switzerland has [four official languages](https://www.fedlex.admin.ch/eli/cc/2009/821/en#art_5): German, French, Italian, and Romansh.

When native speakers of one or more of these languages meet, they follow
certain [regulations](https://www.fedlex.admin.ch/eli/cc/2010/355/en) to choose a language for the group. Here are the rules for
groups of exactly three people:

* When all three are native speakers of the same language, it also becomes their group's language.

* When two are native speakers of the same language, but the third person speaks a different language, all three will converse in the
  minority language.

* When native speakers of three different languages meet, they eschew these three languages and instead use the remaining of the four
  official languages.

The languages are encoded by the letters `D` for *Deutsch*, `F` for *Français*, `I` for *Italiano*, and `K` for *Rumantsch*.

Your task is to write a function that takes a list of three languages and returns the language the group should use.

Examples:

* The language for a group of three native French speakers is French: `FFF` &rarr; `F`

* A group of two native Italian speakers and a Romansh speaker converses in Romansh: `IIK` &rarr; `K`

* When three people meet whose native languages are German, French, and Romansh, the group language is Italian: `DFK` &rarr; `I`