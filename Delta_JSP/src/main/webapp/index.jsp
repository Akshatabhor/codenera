<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to jsp page</h1>
<p>i am learing JSP</p>>
<%! 
int z=100;
int multi()
{
	return z*z;
}
%>
<%
	int a=10;
int b=20;
int c=a+b;
out.print("addition is"+c);

for(int i=0;i<=10;i++)
{
	out.print(20*i+"<br>");
	
}

int rows = 5;  

for(int i = 1; i <= rows; i++) {
    for(int j = 1; j <= i; j++) {
        out.print("* ");
    }
    out.print("<br>"); 
}
%>
<h1>using sciplet tag method call</h1>
<%
out.println(multi());

%>
<h1>using sciplet tag global method call</h1>
<%
out.println(z);
%>
<h1>using sciplet tag</h1>
<%=
multi()
%>
</body>
</html>