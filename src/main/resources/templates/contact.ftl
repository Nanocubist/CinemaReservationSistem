[#ftl]
[#import "/spring.ftl" as spring /]

<!DOCTYPE html>
<html>
<head>
<TITLE>Contact</TITLE>
</head>

<body bgcolor="#737373">
<p  align="right">
<input type="button" value = "Admin Console" onclick="window.location.href='adminPage'"/>
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

Name<br>
<input type="text" name="name">
<br>
Email<br>
<input type="text" name="email">
<br>
Phone number:<br>
<input type="text" name="phonenumber">
<br>
Mesage:<br>
<input type="text" name="mesage" style="height:200px;width:300px;" >
<br>

<input  type="button" value = "send" onclick="myFunction()"></button>

<p id="send"></p>

<script>
function myFunction() {
    document.getElementById("send").innerHTML = "Message sent";
}
</script>

<p> Adress: Cluj-Napoca <br> Street: Eroilor Nr.1 <br> Phone number: 0264 123 </p>

</table>

</body>

</html>