<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    <span id="left_div">
      <p>decoded text</p><br>
      <form action="http://localhost:8080/encoder/encode" method="POST">
        <input type="text" id="decoded_text" name="decoded_text" value="${decoded_text!''}"><br>
        <input type="submit" value="encode">
      </form>
    </span>
    <span id="right_div">
      <p>encoded text</p><br>
      <form action="http://localhost:8080/encoder/decode" method="POST">
        <input type="text" id="encoded_text" name="encoded_text" value="${encoded_text!''}" ><br>
        <input type="submit" value="decode">
      </form>
    </span>
  </body>
</html>