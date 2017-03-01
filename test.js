function myfunction(){
var a =[11][11];
 document.write("<table>");
for (var i=1;i<=10;i++)
{ document.write("<tr>");
for (var j=1;j<=10;j++)
{
//a[i][j] = i * j;
document.writeln("<td>");
document.writeln(a[i][j]);
document.write("</td>");

}
document.write("</tr>");

}
document.write("</table>");

}