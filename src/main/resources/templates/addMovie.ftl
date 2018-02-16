[#ftl]


<html>
<head>
<TITLE>AdminPage</TITLE>
</head>

<body bgcolor="#737373">
	You are logged in as ADMIN<br><br>

<form method="POST" action="/save">

	Enter movie name: <input name="movieName" type="textbox" id="enterMovieName" value="${movie.movieName!''}" /><br><br>

	Select movieType:<br>
	<select>
  <option name="movieType" value="TWO_D">2D</option>
  <option name="movieType" value="THREE_D">3D</option>
  <option name="movieType" value="FOUR_D">4D</option>
  </select><br><br>

	Select movieGenreType:<br>
	<input type="checkbox" name="action" value="movieGenreType"/> Action<br>
    <input type="checkbox" name="comedy" value="movieGenreType"/> Comedy<br>
	<input type="checkbox" name="Adventure" value="movieGenreType"/> Adventure<br>
	<input type="checkbox" name="Crime" value="movieGenreType"/> Crime<br>
	<input type="checkbox" name="Thriller" value="movieGenreType"/> Thriller<br>
	<input type="checkbox" name="Sci-Fi" value="movieGenreType-Fi"/> Sci-Fi<br><br>

	Enter movie duration(minutes): <input name="movieDuration" type="textbox" value="${movie.movieDuration!''}" id="enterMovieDuration" /><br><br>

	Select movieDate:
	<select>
  <option name="movieDate" value="23">23/10/2018</option>

</select><br><br>


	<input  type="button" value = "Back" onclick="window.location.href='adminPage'"  />
	<input  type="submit" value = "save"/>

</form>

	</body>
</html>