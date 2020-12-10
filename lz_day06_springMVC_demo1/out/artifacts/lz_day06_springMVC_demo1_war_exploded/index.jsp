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
    <script src="/js/jquery.min.js"> </script>

    <%--绑定单击事件
    <script >
        $(function () {
                $("#btn").click(function () {
                // alert("hello");
            // 发送json请求
                $.ajax({
                    url:"/user/demo6",
                    ContentType:"application/json;charset=UTF-8",
                    data:'{"username":"lin","id":1}',
                    dataType:"json",
                    type:"post",
                    //回调方法 可以拿到服务端响应的数据
                    success:function(data){
                        alert(data.id);
                    }
                });

            });
        });
    </script>
    --%>
    <script >
        $(function () {
            $("#btn").click(function () {
                // alert("hello");
                // 发送json请求
                $.ajax({
                    url:"/user/demo6",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"mu","passwore":"123","age":30}',
                    dataType:"json",
                    type:"post",
                    //回调方法 可以拿到服务端响应的数据
                    success:function(data){
                        alert(data.username);
                    }
                });
            });
        });
    </script>



</head>
<body>


    <%--自定义类型转换器--%>
    <a href="/user/demo2">测试</a>

    <a href="/user/demo3" >demo3</a>

    <a href="/user/demo4"> demo4</a>

    <button id="btn">点我</button>
</body>
</html>
