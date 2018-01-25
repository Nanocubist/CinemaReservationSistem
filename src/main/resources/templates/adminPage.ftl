[#ftl]
[#import "/spring.ftl" as spring /]


<!DOCTYPE html>
<html>
<head>
<TITLE>AdminPage</TITLE>
</head>

<body bgcolor="#737373">
	You are logged in as ADMIN<br>

	<input type="button" value="addMovie" onclick="window.location.href='addMovie.html'"  /><br>
	<input type="button" value="editMovie" onclick="window.location.href='editMovie.html'"  /><br>
	<input type="button" value="listMovies" onclick="window.location.href='moviesList.html'"  /><br>
	<input type="button" value="back" onclick="window.location.href='/'"  />

	</body>
</html>