<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Weather App</title>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
      <link rel="stylesheet" href="http://getbootstrap.com/examples/sticky-footer/sticky-footer.css">
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

  </head>
  <body>
  <div class="container">
      <div class="page-header">
          <h1>Conditions in {{.Name}}</h1>
      </div>
      <p class="lead">{{range .Weather}}<img src="static/img/{{.Icon}}.png" alt="weather icon"> {{.Description}} {{end}}</p>
      <table class="table table-hover table-condensed" data-toggle="table" data-cache="false">
          <thread>
              <tr>
                  <th>Now</th>
                  <th>High</th>
                  <th>Low</th>
              </tr>
          </thread>
          <tr><td>{{.Main.Temp}} {{.Unit}}</td><td>{{.Main.TempMax}} {{.Unit}}</td><td>{{.Main.TempMin}} {{.Unit}}</td></tr>
      </table>
  </div>
  <footer class="footer">
      <div class="container">
          <p class="text-muted">net/http :: html/template :: Bootstrap :: github.com/briandowns/openweathermap</p>
      </div>
  </footer>
    <script src="<c:url value="/resources/js/weather.js" />"></script>
  </body>
</html>
