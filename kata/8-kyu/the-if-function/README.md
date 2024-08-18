# [The 'if' function](https://www.codewars.com/kata/the-if-function "https://www.codewars.com/kata/54147087d5c2ebe4f1000805")

Create a function called `_if` which takes 3 arguments: a value `bool` and 2 functions (which do not take any parameters): `func1` and `func2`

When `bool` is truthy, `func1` should be called, otherwise call the `func2`.


### Example:

```coffeescript
_if(true, (() -> console.log 'true'), (() -> console.log 'false'))
// Logs 'true' to the console.
```
```c
void the_true() { printf("true"); }
void the_false() { printf("false"); }
_if(true, the_true, the_false);
/* Logs "true" to the console */
```
```nasm
the_true:
 mov rdi .true
 jmp printf
.true: db `true\0`

the_false:
 mov rdi, .false
 jmp printf
.false: db `false\0`

mov dil, 1
mov rsi, the_true
mov rdx, the_false
call _if ; Logs "true" to the console
```
```cpp
void TheTrue() { std::cout << "true" }
void TheFalse() { std::cout << "false" }
_if(true, TheTrue, TheFalse);
// Logs 'true' to the console.
```
```csharp
Kata.If(true, () => Console.WriteLine("True"), () => Console.WriteLine("False"));
// write "True" to console
```
```elixir
_if(true, fn -> IO.puts "true" end, fn -> IO.puts "false" end)
# prints "true" to the console
```
```haskell
main = _if True (putStrLn "You spoke the truth") (putStrLn "liar")
-- puts "You spoke the truth" to the console.

_if False "Hello" "Goodbye" -- "Goodbye"
```
```javascript
_if(true, function(){console.log("True")}, function(){console.log("false")})
// Logs 'True' to the console.
```
```ruby
_if(true, proc{puts "True"}, proc{puts "False"})
# Logs 'True' to the console.
```
```python
def truthy(): 
 print("True")
 
def falsey(): 
 print("False")
 
_if(True, truthy, falsey)
# prints 'True' to the console
```
```rust
_if(true, || println!("true"), || println!("false"))
# prints "true" to the console
```
```lua
kata._if(true, function() print("true") end, function() print("false") end)
-- prints "true" to the console
```
```java
Kata._if(true, () -> System.out.println("true"), () -> System.out.println("false"));
// prints "true" to the System out.
```
