<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 11/13/2021
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<form method="post" action="/library">
    <div class="col-4 mt-4">
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">English</span>
            <input name="english" type="text" class="form-control" placeholder="Username" aria-label="Username"
                   aria-describedby="basic-addon1">
        </div>
    </div>
    <div class="col-4">
        <button type="submit" class="btn btn-primary btn-lg mb-3">Translate</button>
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon">VietNam</span>
            <input value="${vietNam}" name="usd" type="text" class="form-control" placeholder="Username"
                   aria-label="Username"
                   aria-describedby="basic-addon" disabled>
        </div>
    </div>
</form>
</body>
</html>
