<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
    <head>
        <meta content="WebApp de CTP, réalisé en LP DA2I" name="description"/>
        <meta charset="utf-8">
        <title>CTP</title>
        <meta content="width=device-width, initial-scale=1" name="viewport">
        <meta content="Florian Chiraux" name="author">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>

    <body>
        <div class="container">
            <form action="/add" method="get">
                 <div class="form-group">
                   <label for="nom">Nom</label>
                   <input type="text" class="form-control" id="nom" name="nom" placeholder="Nom">
                 </div>
                 <div class="form-group">
                   <label for="prenom">Prenom</label>
                   <input type="text" class="form-control" id="prenom" name ="prenom" placeholder="Prenom">
                 </div>
                 <div class="form-group">
                 <label for="lycee">Lycee</label>
                 <select id="lycee" name="lycee" class="form-select">
                   <c:forEach var="l" items="${lycees}" >
                       <option value="${l.lno}"><c:out value="${l.nom}"/></option>
                   </c:forEach>
                 </select>
                 </div>
                 <button type="submit" class="btn btn-primary">Enregistrer</button>
               </form>
        </div>
    </body>
</html>