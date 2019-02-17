<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>失物招领-登录页面</title>
</head>
<body>
<h2>失物招领</h2>


<fieldset>
    <legend>登陆界面</legend>
<form action="/user/all" method="post">
    <input type="text" name="account"><br>
    <input type="password" name="password"><br>
    <input type="submit" value="登陆">
    <!-- EL语句，后面验证表单时，验证错误反回信息-->

</form>
</fieldset>
</body>
</html>
