<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/sandwichOption" method="post">
    <div class="form-check form-switch">
        <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault" name="Condiments" value="Lettuce">
        <label class="form-check-label" for="flexSwitchCheckDefault">Lettuce</label>
    </div>
    <div class="form-check form-switch">
        <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckChecked" name="Condiments" value="Tomato">
        <label class="form-check-label" for="flexSwitchCheckChecked">Tomato</label>
    </div>
    <div class="form-check form-switch">
        <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDisabled" name="Condiments" value="Mustard">
        <label class="form-check-label" for="flexSwitchCheckDisabled">Mustard</label>
    </div>
    <div class="form-check form-switch">
        <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckCheckedDisabled" name="Condiments" value="Sprouts">
        <label class="form-check-label" for="flexSwitchCheckCheckedDisabled">Sprouts</label>
    </div>
    <button type="submit" class="btn btn-outline-primary mt-3">Save</button>
    <h5>cac gia vi da chon</h5>
    <c:forEach var="condiment" items="${condiments}" varStatus="condiments">
        <span>${condiment}</span>
    </c:forEach>
</form>
</body>
</html>
