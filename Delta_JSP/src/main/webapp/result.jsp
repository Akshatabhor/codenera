<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("name");
int num1=Integer.parseInt(request.getParameter("no"));
%>
<h1>Hello<%out.println(name); %></h1>
<%
int n = num1;
int rev = 0;
while (num1 != 0) {
    int rem = num1 % 10;
    rev = rev * 10 + rem;
    num1 = num1 / 10;
}

if (n == num1) {
    out.println("User number is a palindrome");
} else {
    out.println("User number is not a palindrome");
}
%>
<%
int start = Integer.parseInt(request.getParameter("start"));
int end = Integer.parseInt(request.getParameter("end"));

%>
<%
    out.println("<h2>Palindrome numbers between " + start + " and " + end + ":</h2>");
%>
<%
    for (int no = start; no <= end; no++) {  
        int n1 = no;
        int rev1 = 0;
        while (n != 0) {
            int rem = n % 10;
            rev1 = rev1 * 10 + rem;
            n = n / 10;
        }
        if (rev1 == no) {
            out.println(no + "<br>");
        }
    }
%>

</body>
</html>