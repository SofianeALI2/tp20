<%--
  Created by IntelliJ IDEA.
  User: HB
  Date: 23/05/2019
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <title>Hello, world!</title>
</head>
<body>
<a href="createLivresServlet">Livres</a>
<a href="createFilmServlet">Films</a>

<h1 class="title">Insertion d'un film</h1>
<div class="container">
    <div class="row">
        <div class="col">
        </div>
        <div class="col-6">
            <form class="musicCreate" action="./createLivreServlet" method="post">
                <div class="form-group">
                    <label>Titre du film</label>
                    <input class="form-control" type="text" placeholder="Titre" name="TitreFilm">
                </div>
                <div class="form-group">
                    <label>Nom du réalisateur</label>
                    <input class="form-control" type="text" placeholder="Réalisateur" name="Réalisateur">
                </div>

                <div class="form-group">
                    <label>Année)</label>
                    <input class="form-control" type="number" placeholder="2000" min="0" name="Annee">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            <a href="listFilmServlet" id="listAccessText">Voir la liste </a>
        </div>
        <div class="col">
        </div>
    </div>
</div>
</main>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>