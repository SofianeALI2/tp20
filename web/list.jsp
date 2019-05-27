<%--
  Created by IntelliJ IDEA.
  User: HB
  Date: 23/05/2019
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hello, world!</title>
</head>
<body>

<main>
    <h1 class = "title">Liste des musiques</h1>
    <div class="divList">
        <div class="container">
            <div class="table-responsive">
            <table class="table table-striped">
                <thead class = thead-light>
                <tr>
                    <th scope="col">Titre</th>
                    <th scope="col">Artiste</th>
                    <th scope="col">Duree</th>
                    <th score="col">Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="u" items="${musiqueList}">
                    <tr>
                        <td>${u.getTitre()}</td>
                        <td>${u.getArtiste()}</td>
                        <td>${u.getDuree()}</td>
                        <td>
                                <form action="deleteServlet" method="post">
                                    <button type="submit" class="buttonDelete">
                                        <input type="hidden" name="delete" value="${u.getId()}">
                                        <i class="fas fa-trash-alt"></i>
                                    </button>
                                </form>

                        </td>
                    </tr>



                </c:forEach>
                </tbody>
            </table>
            </div>
        </div>
    </div>

</main>



<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>