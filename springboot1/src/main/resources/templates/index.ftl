<html>
<head>
    <title>UserList</title>
</head>
<body>
    <table border="1px" cellspacing="0" cellpadding="0" width="100%">
        <thead>
            <tr>
                <th>id</th>
                <th>用户名</th>
                <th>密码</th>
                <th>姓名</th>
            </tr>
        </thead>
        <tbody>
            <#list userList as user>
                <tr style="text-align: center">
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.name}</td>
                </tr>
            </#list>
        </tbody>
    </table>
</body>
</html>