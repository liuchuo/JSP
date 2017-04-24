<%@ page contentType="text/html; charset=UTF-8" %>
<HTML>
<HEAD>
    <meta charset="utf-8">
</HEAD>
<BODY>

<!-- jsp中的java程序片 -->
如果一个正整数刚好等于它的真因子之和，这样的正整数为完数。</br>例如，6=1+2+3，因此6就是一个完数。</br>1到1000内的完数有：
    <% int i, j, sum = 0;
        for (i = 1; i <= 1000; i++) {
            sum = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0)
                    sum = sum + j;
            }
            if (sum == i)
                out.print(" " + i);
    }
    %>

<!-- 表达式 -->
<% double x = 0.9, y = 3; %>
<P>Sin(<%= x %>)除以<%= y %>等于<%= Math.sin(x)/y %></P>

<!-- page指令 -->
page指令用来定义整个JSP页面的一些属性和这些属性的值，page指令标记可以制定如下属性的值：<br>
contentType，如contentType="text/html;charset=UTF-8"，所以说contentType属性指定JSP页面相应的MIME类型和JSP页面字符的编码。<br>

import，如import="java.util.*"，JSP页面默认import属性已经有如下值："java.lang.*"、“javax.servlet.*"、"javax.servlet.jsp"、"javax.servlet.http.*"<br>

language，如language="java" 只能取java，不写的话默认是java～<br>

session，用于设置是否需要使用内置的session对象。session属性的属性值可以是true或false，默认是true～<br>

buffer，用来指定内置输出流对象out设置的缓冲区的大小或不使用缓冲区，默认值是8KB，可取none<br>

autoFlush<br>

isThreadSafe<br>

pageEncoding<br>

info<br>

不允许两次使用page指令给contentType属性指定不同的值<br>

<!-- include指令 -->
<%@ include file="1.jsp" %>
<!-- include的jsp文件中不能重复定义变量i和sum，否则会报错。 -->


</BODY>
</HTML>