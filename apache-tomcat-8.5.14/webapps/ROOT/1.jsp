<%@ page contentType="text/html; charset=UTF-8" %>
<HTML>
<head>
    <meta charset="utf-8">
</head>
<BODY BGCOLOR=pink>
<FONT Size=3>
<P>这是一个简单的JSP页面
<% //这是Java程序片
    sum = 0;
    for (i = 1; i <= 100; i++) {
        sum = sum + i;
    }
%></P>
<P>1到100的连续和是：<%=sum%></P>
</FONT>
</BODY>
</HTML>