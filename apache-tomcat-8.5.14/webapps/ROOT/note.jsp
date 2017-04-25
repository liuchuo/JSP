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

<!-- 指令标记 -->
<!-- page指令标记 -->
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

<!-- include指令标记 -->
<%@ include file="1.jsp" %>
<!-- include的jsp文件中不能重复定义变量i和sum，否则会报错。 -->

<!-- 动作标记 -->
与静态插入文件的include指令标记不同，当JSP引擎把JSP页面转译成Java文件时，不把JSP页面中的动作指令include所指定的文件与JSP页面合并一个新的JSP页面，而是告诉Java解释器，这个文件在JSP运行时才被处理。
<!-- include动作标记 -->
<jsp:include page="1.jsp"/>
<!-- param动作标记 -->
使用request.getParameter("name的值"); 获取param子标记中name属性的值
<!-- forward动作标记 -->
<%-- <jsp:forward page="1.jsp"/> --%>
<!-- plugin动作标记 -->

<!-- useBean动作标记 -->
Sun公司倡导，用HTML完成JSP页面的静态部分用JavaBean完成动态部分，实现真正意义上的静态和动态之分割。<br>

<!-- Tag文件与Tag标记 -->
<%@ taglib tagdir="/WEB-INF/tags" prefix="myTagName" %>
以下是调用Tag文件的效果：<br>
<myTagName:tagfile1 />

</BODY>
</HTML>