<%@ page contentType="text/html;charset=UTF-8" %>
<HTML>
<HEAD>
    <meta charset="utf-8">
</HEAD>
<BODY BGCOLOR=pink>
<FONT Size=3>
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
</FONT>
</BODY>
</HTML>