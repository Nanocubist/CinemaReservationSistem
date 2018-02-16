[#ftl]


<html>

<head>
<TITLE>AdminPage</TITLE>
</head>

<body bgcolor="#737373">
You are logged in as ADMIN<br><br>

	Movies<br>

    <p><b>Movies List</b>
    </p>

    <a href="addMovies">ADD</a>
    <table class="table">
    <tr>
        <th>Movie Name</th>
        <th>Movie Genre Type</th>
        <th>Movie Type</th>
        <th>Movie Duration</th>
        <th>Movie Date</th>
        <th></th>
    </tr>

[#list movies as movie]
<tr>
    <td>${movie.movieName}</td>
    <td>${movie.movieGenreType}</td>
    <td>${movie.movieType}</td>
    <td>${movie.movieDuration}</td>
    <td>${movie.movieDate?string('dd/MM/yyyy')}</td>
</tr>
[/#list]


</table>


	<input  type="button" value = "Back" onclick="window.location.href='adminPage.html'"  />
	<input  type="button" value = "Edit-Delete Movies" onclick="window.location.href='moviesList.html'"  />

</body>
</html>