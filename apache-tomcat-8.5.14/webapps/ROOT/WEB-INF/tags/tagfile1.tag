这是一个tag文件<br>负责计算1～100之内的奇数之和：
<% int sum = 0, i = 1;
    for (i = 1; i <= 100; i++) {
        if (i % 2 == 0)
            sum = sum + i;
    }
    out.print(sum);
%>
