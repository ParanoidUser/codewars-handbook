<h1 align="center">Codewars Handbook ☕️🚀</h1>

<p align="center">
   <a href="https://hits.dwyl.com/ParanoidUser/codewars-handbook">
      <img src="https://img.shields.io/badge/dynamic/xml?color=success&label=views&query=//*[name()=%27text%27][2]&url=https://hits.dwyl.com/ParanoidUser/codewars.svg"
           title="Views statistics +1 👀">
   </a>
   <a href="https://www.codewars.com">
      <img src="https://img.shields.io/badge/solved%20kata-1095-red.svg"
           title="Solved kata 👌">
   </a>
   <a href="https://travis-ci.com/ParanoidUser/codewars-handbook">
      <img src="https://img.shields.io/travis/ParanoidUser/codewars-handbook.svg"
           title="CI pipeline 🛠">
   </a>
   <a href="https://sonarcloud.io/dashboard?id=codewars-handbook">
      <img src="https://img.shields.io/sonar/alert_status/codewars-handbook?server=https%3A%2F%2Fsonarcloud.io"
           title="Quality gate 🔎">
   </a>
   <a href="https://gitter.im/ParanoidUser/codewars-handbook">
      <img src="https://img.shields.io/gitter/room/ParanoidUser/codewars-handbook?color=49c39e"
           title="Let's have a chat! 📞">
   </a>
<p>

[Codewars](https://www.codewars.com) is an educational online platform for computer programming. On the platform, users aka "*codewarriors*" try to solve programming challenges known as "*kata*" to practice programming skills and gain honor points, which represent the level of respect a user has earned from the community. Each kata is set to a kyū rank, based on its subject area and difficulty. The harder the kata, the more points. Every new codewarrior is ranked as 8 kyū (Beginner) and can advance through the ranks by completing kata at or above their rank to reach the final 4th dan (Master). Kyū indicates the number of degrees away from the master level. This is why they count downward. Once you reach the master level, we count upward. Enough said... Banzaaaai!

## Overview

The repository contains a collection of Java solutions for Codewars challenges grouped by a kyū rank. Each kata is placed in a separate folder named by its slug and accompanied by a task description, a solution source code, and verification tests. All solutions were solved on [the official platform](https://www.codewars.com), verified against their original test cases, and styled to achieve the shortest source code that implements a certain algorithm.

<ins>For quick access</ins> use the index table or do a search by kata URL, name, ID or slug in the repository. 

<table>
   <tbody>
      <tr>
         <th>Difficulty</th>
         <th>Rank</th>
         <th>Solved</th>
      </tr>
      <tr>
         <td rowspan=1>In Beta process (4 points)</td>
         <td>
            <a href="/kata/beta/index.md"
               title="All published kata which are waiting for community approval and difficulty ranking">Any
            </a>
         </td>
         <td>83</td>
      </tr>
      <tr>
         <td rowspan=2>Beginner (2 points)</td>
         <td>
            <a href="/kata/8-kyu/index.md"
               title="- Defining a simple function (i.e. hello world)&#13;- Basic variable assignments&#13;- Fixing basic syntax issues&#13;- Trivial algorithms such as basic if/else statements">8th kyū
            </a>
         </td>
         <td>179</td>
      </tr>
      <tr>
         <td>
            <a href="/kata/7-kyu/index.md"
               title="- Iterating arrays and returning a subset of values&#13;- Basic data type manipulations&#13;- Basic functional or object-oriented concepts&#13;- Basic Regular Expressions">7th kyū
            </a>
         </td>
         <td>468</td>
      </tr>
      <tr>
         <td rowspan=2>Novice (8 points)</td>
         <td>
            <a href="/kata/6-kyu/index.md"
               title="- Complex language features (closures, scopes, monads, etc)&#13;- Complex OOP/Functional concepts&#13;- Basic Design Patterns&#13;- Complex Regular Expressions">6th kyū
            </a>
         </td>
         <td>352</td>
      </tr>
      <tr>
         <td>
            <a href="/kata/5-kyu/index.md"
               title="- Complex language features that require mature OOP/Functional concepts&#13;- Advanced OOP/Functional concepts&#13;- Complex Design Patterns&#13;- Advanced regular expression usage">5th kyū
            </a>
         </td> 
         <td>6</td>
      </tr>
      <tr>
         <td rowspan=2>Competent (32 points)</td>
         <td>
            <a href="/kata/4-kyu/index.md"
               title="- Computer science concepts utilizing complex algorithms&#13;- Advanced design patterns&#13;- Understanding intricate business requirements&#13;- Advanced concepts such as concurrency, parallelism, meta programming and cryptography">4th kyū
            </a>
         </td>
         <td>4</td>
      </tr>
      <tr>
         <td>
            <a href="/kata/3-kyu/index.md"
               title="- Computer science concepts utilizing advanced algorithms&#13;- Ability to implement advanced requirements in a scalable fashion&#13;- Basic AI/machine learning algorithms&#13;- Detailed usage of advanced concepts such as concurrency, parallelism and cryptography">3rd kyū
            </a>
         </td>
         <td>3</td>
      </tr>
      <tr>
         <td rowspan=2>Proficient (128 points)</td>
         <td>
            <a href="/kata/2-kyu/index.md"
               title="- Complex AI/machine learning algorithms&#13;- Reverse engineering techniques&#13;- Basic interpreters and compilers&#13;- Basic mini-programs with multiple feature requirements (such as a basic markdown parser)">2nd kyū
            </a>
         </td>
         <td>-</td>
      </tr>
      <tr>
         <td>
            <a href="/kata/1-kyu/index.md" 
               title="- Advanced AI/machine learning algorithms&#13;- Complex interpreters and compilers&#13;- Complex Mini-programs with multiple feature requirements (such as a complete markdown parser)">1st kyū
            </a>
         </td>
         <td>-</td>
      </tr>
   </tbody>
</table>

**Pay attention:** the source code is written with Java 11 and uses language features that could be incompatible with Java 8 kata versions.

## Disclaimer

Please **DO NOT** look at the solutions until you've solved a kata or at least took the time to think about your own approaches to solve the challenge. Keep in mind, using materials of this repository to gain rank, you violate [the policies of Codewars](https://github.com/Codewars/codewars.com/wiki/Community-Code-of-Conduct#policy), which state:
> If you are caught cheating on a challenge, you will initially have your solution marked as a cheat and will not receive any honor or rank. This includes clever solutions that are clearly created for the spirit of cheating. Repeat offenders who have intentionally cheated will be banned.

You acknowledge and agree that your use of the repository materials is at your own risk. The author assumes no responsibility or liability for any consequence resulting directly or indirectly for any action or inaction you take based on or made in reliance on the information or material on or linked to this repository. The information contained in this repository is provided on an "as is" basis with no guarantees of completeness, accuracy, usefulness or timeliness. The author reserves the right to change any and all items used or contained in the repository at any time without notice.

## Contribute

Your contribution is highly appreciated here. Feel free to send fixes and your brilliant ideas.  
If you have any questions or comments, [the chat](https://gitter.im/paranoiduser/codewars-handbook) is open for discussion anytime.

### ✔️ DO'S

> *"This solution no longer passes test cases!"* 😤

Oops... Please open an issue or create a pull request with a working copy.

---
> *"This solution has a bug!"* 😳

D'oh! Please open an issue or create a pull request with a fixed version.

---
> *"This solution is retrograde and can be solved by a one-liner!"* 🤔

You know what to do, right? 😉 Open an issue or create a pull request with an update!

### ⛔ DON'TS

> Please **DO NOT** send new solutions for kata challenges!

All challenges in the repository were solved by the author themselves and are cherry-picked to be shared with the community. To avoid harm and abuse to the Codewars platform and kata senseis the publishing process goes in the specific order. It starts with an 8-kyū rank (the easiest) and moves to a higher rank when all challenges in the group are solved. Within the same kyu, kata are selected by publication date from the oldest to the newest.

> Please **DO NOT** fork or clone the repository for any purposes other than contribution!

By making your own (or other code warriors') solutions accessible to anyone you disrespect [the Community Code of Conduct](https://github.com/Codewars/codewars.com/wiki/Community-Code-of-Conduct). It's highly discouraged by the Codewars team and the community.

### ❤️ Your Support

If you find the repo helpful, **please give it a thank with a star** <span title="↑↑↑ hit that button ↑↑↑">👉⭐👈</span>  
As a token of appreciation the names of all stargazers will be mentioned in the release note. Hit the watch button to stay tuned!  
