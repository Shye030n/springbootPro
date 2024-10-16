<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<%-- springboot는 .jsp를 못하기 때문에 html파일로 만든 후(자동완성됨),.jsp로 리팩터링하기    --%>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
${boardList}
</body>
</html>
