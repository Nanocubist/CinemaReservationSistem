[#ftl]
[#import "/spring.ftl" as spring /]

<html>
<head>
<TITLE>News</TITLE>
</head>

<body bgcolor="#737373">
<p  align="right">
User:<input type="text" name="user">
Password:<input type="text" name="password">
<input type="button" value = "LOGIN" onclick="window.location.href='LOGIN.html'"/>
</p>
	<fieldset>
			<legend><style>
						legend {
						font-size: 40px
						}</style> CINEMA </legend>

			<input type="button" value = "HOME" onclick="window.location.href='/'"  />
			<input type="button" value="MOVIES" onclick="window.location.href='movies.html'"/>
			<input type="button" value="PROGRAM" onclick="window.location.href='program.html'" />
			<input type="button" value="NEWS" onclick="window.location.href='news'"/>
			<input type="button" value="CONTACT" onclick="window.location.href='Contact.html'"/>
			SEARCH: <input type="textbox" id="search" />

	</fieldset>
	</body>
</html>