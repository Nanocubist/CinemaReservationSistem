[#ftl]
[#import "/spring.ftl" as spring /]

<html>
<head>
<TITLE>Program</TITLE>
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
			<input type="button" value="MOVIES" onclick="window.location.href='Movies.html'"/>
			<input type="button" value="PROGRAM" onclick="window.location.href='program.html'" />

			<input type="button" value="NEWS" onclick=""/>
			<input type="button" value="CONTACT" onclick="window.location.href='Contact.html'"/>
			SEARCH: <input type="textbox" id="search" />

	</fieldset>

	<table border="2" ALIGN="CENTEr" bgcolor="#e6e6e6" width="100%" heigth="80%">
	</tr><td><P ALIGN="CENTEr" color="red">
	Movie
    </p>
    </td>
	<td><P ALIGN="CENTEr">
	Type
     </p>
    </td>
<td><P ALIGN="CENTEr">
	Rating
     </p>
    </td>
	<td><P ALIGN="CENTEr">
	Minutes
     </p>
    </td>
	<td><P ALIGN="center">
	Description
    </p>
    </td>

</tr>
<tr>
<td><P ALIGN="center">
	<A HREF=".HTML">
	Black Panter <br>
	</a>
    </p>
    </td>
<td><P ALIGN="center">
	Action
    </p>
    </td>
	<td><P ALIGN="center">
	+15
    </p>
    </td>
	<td><P ALIGN="center">
	108
    </p>
    </td>
	<td><P ALIGN="center">
	T'Challa, after the death of his father, the King of Wakanda,
	returns home to the isolated, technologically advanced African
	nation to succeed to the throne and take his rightful place as king.
    </p>
    </td>
<tr>
</tr><td><P ALIGN="CENTEr" color="red">
	<A HREF=".HTML">
	Jumanji
	</a>
    </p>
    </td>
	<td><P ALIGN="center">
	Adventure,Comedy
    </p>
    </td>
	<td><P ALIGN="center">
	+12
    </p>
    </td>
	<td><P ALIGN="center">
	99
    </p>
    </td>
	<td><P ALIGN="center">
	Four teenagers are sucked into a magical video game, and the only way they
	can escape is to work together to finish the game.
    </p>
    </td>
</tr>
</tr><td><P ALIGN="CENTEr" color="red">
	<A HREF=".HTML">
	Logan
	</a>
    </p>
    </td>
	<td><P ALIGN="center">
	Action,Drama,Sci-Fi
    </p>
    </td>
	<td><P ALIGN="center">
	+15
    </p>
    </td>
	<td><P ALIGN="center">
	121
    </p>
    </td>
	<td><P ALIGN="center">In the near future, a weary Logan cares for an ailing
	Professor X, somewhere on the Mexican border. However, Logan's attempts to
	hide from the world, and his legacy, are upended when a young mutant arrives,
	pursued by dark forces.
    </p>
    </td>
</tr>
</tr><td><P ALIGN="CENTEr" color="red">
	<A HREF=".HTML">
	Thor
	</a>
    </p>
    </td>
</tr>
</tr><td><P ALIGN="CENTEr" color="red">
	<A HREF=".HTML">
	Logan Lucky
	</a>
    </p>
    </td>
</tr>
</tr><td><P ALIGN="CENTEr" color="red">
	<A HREF=".HTML">
	John Wick: Chapter 2
	</a>
    </p>
    </td>
</tr>
</tr><td><P ALIGN="CENTEr" color="red">
	<A HREF=".HTML">
	Dunkirk
	</a>
    </p>
    </td>
</tr>
</tr><td><P ALIGN="CENTEr" color="red">
	<A HREF=".HTML">
	King Arthur: Legend of the Sword
	</a>
    </p>
    </td>
</tr>
</tr><td><P ALIGN="CENTEr" color="red">
	<A HREF=".HTML">
	Fantastic Beasts and Where to Find Them
	</a>
    </p>
    </td>
</tr>
</table>

</body>

</html>