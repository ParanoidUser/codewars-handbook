# [Simple Socket Client](https://www.codewars.com/kata/simple-socket-client "https://www.codewars.com/kata/639107e0df52b9cb82720575")

There is a socket listening on port 1111 of local host.

The socket either belongs to a server that sends back anything you send to it,
or to a server that reverses anything you send to it.

Create a function that does the following:

- Connects to the socket on port 1111.
- Sends one packet to the server.
- Receives one packet from the server.
- Returns `True` if the server is the regular type (i.e., it sends back the same packet that was
  sent to it), or `False` if the server is the reversing type (i.e., it reverses the packet that was
  sent to it).

Make sure to close the socket after you are done using it. If you time out while trying to connect,
it is likely that you did not connect, send, receive, and close the socket in the correct order.