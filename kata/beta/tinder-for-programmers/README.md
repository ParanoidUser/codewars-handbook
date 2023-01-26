# [Tinder for Programmers](https://www.codewars.com/kata/tinder-for-programmers "https://www.codewars.com/kata/62c68f0920d291001737fa22")

You might know the popular app "Tinder", which can be used to find nice people, which fit to you.
The core functionality of it is to show you profiles of people, and you can decide to either **swipe
left** to dismiss the chance to get to know the person or to **swipe right**, if the profile sounds
promising.

In this kata we want to build something similar to find programmer profiles, which fit to us :)

## Task

You are given one person's profile and two callbacks: one to swipe to the left and another one to
swipe to the right. If the person mentions your favorite programming language in their bio, then you
want to give your friendship a chance and swipe to the right. Otherwise, you swipe to the left.

**Note**: Your favorite programming language is assumed to be the one, you're solving this kata in.
So if you're solving this kata in Javascript, you should look out for `JavaScript` in the profile
text. See the examples matching and non-matching profiles.

## Profile Structure

Each profile has the following fields:

- `name` (string)
- `age` (int)
- `bio` (string)

## Examples

### Swipe Right

```
// fields are available via profile.getName(), profile.getAge() and profile.getBio()
var profile = new Profile(
  "Julia Green",
  24,
  "From Chile. Sushi lover 🍣 Learning Java on codewars.com. Always be yourself. Unless you can be a unicorn, then always be a unicorn 🦄"
);

ProgrammersMacher.rateProfile(profile, swipeLeft, swipeRight);
// should call swipeRight.execute(), as Java is mentioned in the bio
```

### Swipe Left

```
// fields are available via profile.getName(), profile.getAge() and profile.getBio()
var profile = new Profile(
  "Peter Parker",
  31,
  "Huge soccer fan ⚽️ Living in Dallas. Rust = ❤️"
);

ProgrammersMacher.rateProfile(profile, swipeLeft, swipeRight);
// should call swipeLeft.execute(), as Java is not mentioned in the bio
```