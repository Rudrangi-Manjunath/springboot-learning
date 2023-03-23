<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Springboot MVC</title>
</head>
<body>
  <h5> Hello World </h5>
  <form action="addAlien" method="post">
    <input type="text" name="aid" placeholder="Enter aid  value">
    <input type="text" name="aname" placeholder="Enter aname  value">
    <input type="submit" value="Submit">
    </form>
    <br>
    <button onclick="window.location.href='http://localhost:8080/getAliens'">Get All Aliens</button>
</body>
</html>