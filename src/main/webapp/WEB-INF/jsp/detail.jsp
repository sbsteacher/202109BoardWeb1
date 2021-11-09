<%@ page import="com.koreait.board.BoardVO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    BoardVO aaa = (BoardVO)request.getAttribute("bbb");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><%= aaa.getTitle() %></title>
</head>
<body>
    <div>제목 : <%= aaa.getTitle() %></div>
    <div>작성자 : <%= aaa.getWriter() %></div>
    <div>작성일시 : <%= aaa.getRdt() %></div>
    <div><%= aaa.getCtnt() %></div>
</body>
</html>