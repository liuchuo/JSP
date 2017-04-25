<%@ page contentType="text/html; charset=UTF-8" %>
<HTML>
<head>
    <meta charset="utf-8">
</head>
<BODY BGCOLOR=pink>
<FONT Size=3>
<P>这是一个简单的JSP页面
<% //这是Java程序片
    int tempsum = 0;
    for (int k = 1; k <= 100; k++) {
        tempsum += k;
    }
%></P>
<P>1到100的连续和是：<%= tempsum %></P>
</FONT>
</BODY>
</HTML>