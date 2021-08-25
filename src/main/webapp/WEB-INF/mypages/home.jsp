<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>WELCOME TO STUDENT DATA PAGE</h1>
Data is : ${std}
<br/>
<table border="1">
<tr>
<th>ID</th>
<th>NAME</th>
<th>COURSE</th>
<th>ADDRESS</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.id}</td>
<td>${ob.name}</td>
<td>${ob.course}</td>
<td>${ob.addr}</td>
</tr>
</c:forEach>
</table>
</body>
</html>