DIServlet (Dynamic Image Servlet)
=================================

DIServlet is a very tiny servlet that serves images dynamically. A request is made to the servlet,
providing an image id, and the servlet looks it up in its store and writes the image to the output
stream.

This servlet is great for dynamically loading images in a GWT application where image data can not
be transferred from the server to the client via RPC.
