# [Basic socket server](https://www.codewars.com/kata/basic-socket-server "https://www.codewars.com/kata/6390ea74913c7f000d2e95cd")

Create a tcp socket that listens on port 80 on local host,

When a user connects to the socket, the following should happen:

- If the user sends a string containing only the word "exit", the socket and connection should close
  and the function should end.
- For any other string the user sends, the server should send a copy of the string back to the user.

you can assume short strings all ending in "\n" other than "exit"