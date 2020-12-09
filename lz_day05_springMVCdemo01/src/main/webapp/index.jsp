<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/9
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<a href="user/userdemo2">测试</a>
    <form action="/user/userdemo3" method="post">
        姓名：<input type="text" name="username">
        年龄：<input type="text" name="age">
        金额：<input type="text" name="account.id">
        <input type="submit" value="提交">--%>

    <%--把数据封装到对象中。包括集合类型
    <form action="/user/userdemo4" method="post">
        姓名：<input type="text" name="username">
        年龄：<input type="text" name="age">
                <br/>
        金额1：<input type="text" name="accountList[0].id">
        账户：<input type="text" name="accountList[0].accountName">
                <br/>
        金额1：<input type="text" name="accountMap['木'].id">
        账户：<input type="text" name="accountMap['木'].accountName">

        <input type="submit" value="提交">--%>

    <%--自定义类型转换器--%>
    <form action="/user/accountdemo5" method="post">

        金额：<input type="text" name="id">
        账户：<input type="text" name="accountName">
        时间：<input type="text" name="accountData">

        <input type="submit" value="提交">
    </form>
</body>
</html>
