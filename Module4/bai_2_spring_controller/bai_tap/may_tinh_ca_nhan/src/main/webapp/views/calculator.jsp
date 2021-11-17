<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<form method="post" action="/calculator">
    <div class="col-4 mb-3">
        <label for="formFile" class="form-label">Value 1</label>
        <input class="form-control" name="value1" type="text" id="formFile">
    </div>
    <div class="col-4 mb-3">
        <label for="formFile1" class="form-label">Value 2</label>
        <input class="form-control" name="value2" type="text" id="formFile1">
    </div>
    <button type="submit" name="calculation" value="add">Addition(+)</button>
    <button type="submit" name="calculation" value="sub">Subtraction(-)</button>
    <button type="submit" name="calculation" value="mul">Multiplication(X)</button>
    <button type="submit" name="calculation" value="div">Division(/)</button>
    <p>${value}</p>
</form>
</body>
</html>
