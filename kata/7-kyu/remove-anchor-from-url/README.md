# [Remove anchor from URL](https://www.codewars.com/kata/remove-anchor-from-url "https://www.codewars.com/kata/51f2b4448cadf20ed0000386")

Complete the function/method so that it returns the url with anything after the anchor (`#`) removed. 

## Examples

~~~if-not:nasm
```
"www.codewars.com#about" --> "www.codewars.com"
"www.codewars.com?page=1" -->"www.codewars.com?page=1"
```
~~~

~~~if:nasm
```
url1: db `www.codewars.com#about\0`
url2: db `www.codewars.com?page=1\0`
 
 mov rdi, url1
 call rmurlahr ; RAX <- `www.codewars.com\0`
 
 mov rdi, url2
 call rmurlahr ; RAX <- `www.codewars.com?page=1\0`
```
~~~
