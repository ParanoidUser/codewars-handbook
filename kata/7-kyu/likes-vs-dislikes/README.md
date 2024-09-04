# [Likes Vs Dislikes](https://www.codewars.com/kata/likes-vs-dislikes "https://www.codewars.com/kata/62ad72443809a4006998218a")

## Story

YouTube had a like and a dislike button, which allowed users to express their opinions about particular content. It was set up in such a way that you cannot like and dislike a video at the same time.
There are two other interesting rules to be noted about the interface:
Pressing a button, which is already active, will undo your press.
If you press the like button after pressing the dislike button, the like button overwrites the previous "Dislike" state. The same is true for the other way round.

## Task

Create a function that takes in a list of button inputs and returns the final state.

## Examples

```python
like_or_dislike([Dislike]) ➞ Dislike
like_or_dislike([Like, Like]) ➞ Nothing
like_or_dislike([Dislike, Like]) ➞ Like
like_or_dislike([Like, Dislike, Dislike]) ➞ Nothing
```
```haskell
[Dislike] -> Just Dislike
[Like,Like] -> Nothing
[Dislike,Like] -> Just Like
[Like,Dislike,Dislike] -> Nothing
```
```factor
{ Dislike } -> Dislike
{ Like Like } -> Nothing
{ Dislike Like } -> Like
{ Like Dislike Dislike } -> Nothing
```
```javascript
likeOrDislike([Dislike]) => Dislike
likeOrDislike([Like,Like]) => Nothing
likeOrDislike([Dislike,Like]) => Like
likeOrDislike([Like,Dislike,Dislike]) => Nothing
```
```coffeescript
likeOrDislike([Dislike]) -> Dislike
likeOrDislike([Like,Like]) -> Nothing
likeOrDislike([Dislike,Like]) -> Like
likeOrDislike([Like,Dislike,Dislike]) -> Nothing
```
```lambdacalc
like-or-dislike [Dislike] -> Dislike
like-or-dislike [Like,Like] -> Nothing
like-or-dislike [Dislike,Like] -> Like
like-or-dislike [Like,Dislike,Dislike] -> Nothing
```
```prolog
like_or_dislike([dislike], dislike).
like_or_dislike([like, like], nothing).
like_or_dislike([dislike, like], like).
like_or_dislike([like, dislike, dislike], nothing).
```
```julia
likeordislike([Dislike]) => Dislike
likeordislike([Like, Like]) => nothing
likeordislike([Dislike, Like]) => Like
likeordislike([Like, Dislike, Dislike]) => nothing
```
```java 
likeOrDislike([Dislike]) -> Dislike
likeOrDislike([Like,Like]) -> Nothing
likeOrDislike([Dislike,Like]) -> Like
likeOrDislike([Like,Dislike,Dislike]) -> Nothing
```


## Notes

- If no button is currently active, return `Nothing`.
- If the list is empty, return `Nothing`.

~~~if:lambdacalc
## Encodings

purity: `LetRec` 
numEncoding: `None` 
export constructors `nil, cons` for your `List` encoding 
you can use `Like, Dislike, Nothing` which are `Preloaded` as

```lambdacalc
Like = λ like dislike nothing . like
Dislike = λ like dislike nothing . dislike
Nothing = λ like dislike nothing . nothing
```
~~~
