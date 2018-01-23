[#ftl]
[#import "/spring.ftl" as spring /]

<html>
<head>
<TITLE>program</TITLE>
</head>

<body bgcolor="#FF8000">
<p  align="right">LOGIN User:<input type="text" name="user"> Password:<input type="text" name="password"> </p>
	<fieldset>
			<legend><style>
						legend {
						font-size: 40px
						}</style> CINEMA </legend>

			<input type="button" value = "HOME" onclick="window.location.href='/'"  />
			<input type="button" value="MOVIES" onclick=""/>
			<input type="button" value="PROGRAM" onclick="window.location.href='program.html'" />

			<input type="button" value="NEWS" onclick=""/>
			<input type="button" value="CONTACT" onclick=""/>
			SEARCH: <input type="textbox" id="search" />

	</fieldset>

	<table border="2" ALIGN="CENTEr" bgcolor="#FF8230" width="60%" heigth="80%">
	</tr><td><P ALIGN="CENTEr" color="red">
	Movie Date :<select>
  <option value="23">23.01.2018</option>
  <option value="24">24.01.2018</option>
  <option value="25">25.01.2018</option>
  <option value="26">26.01.2018</option>
  <option value="27">27.01.2018</option>
  <option value="28">28.01.2018</option>
  <option value="29">29.01.2018</option>
</select>
     </p>
    </td>
<td><P ALIGN="CENTEr">
	Hour
     </p>
    </td>

</tr>
<tr>
<td><P ALIGN="center">
	<A HREF=".HTML">
	Black Panter <br>
	Jumanji <br>
	Logan <br>
	Thor <br>
	Logan Lucky <br>
	John Wick: Chapter 2 <br>
	Dunkirk  <br>
	King Arthur: Legend of the Sword <br>
	</a>
    </p>
    </td>
<td><P ALIGN="center">
	<A HREF=".HTML">
	15:00 18:00 21:00 <br>
	20:00 22:40 <br>
	18:00<br>
	19:00 21:30<br>
	19:30 22:00<br>
	16:30 20:00 22:40<br>
	15:00 18:00 21:00 <br>
	18:30 21:00<br>
	</a>
    </p>
    </td>
<tr>
</table>

</body>

</html>

