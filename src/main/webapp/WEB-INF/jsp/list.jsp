<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.koreait.board.BoardVO" %>
<%@ page import="java.util.List" %>
<%
    List<BoardVO> list = (List<BoardVO>)request.getAttribute("data");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>리스트</title>
    <link rel="stylesheet" href="/css/test.css">
    <style>
        table, td, th {
            border-collapse: collapse;
            border: 1px solid #000;
        }
    </style>
</head>
<body>
    <div>
        <a href="/write"><input type="button" value="글쓰기"></a>
    </div>
    <table>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>글쓴이</th>
            <th>작성일시</th>
        </tr>
        <% for(BoardVO vo : list) { %>
        <tr>
            <td><%= vo.getIboard() %></td>
            <td>
                <a href="/detail?iboard=<%= vo.getIboard() %>">
                    <%= vo.getTitle() %>
                </a>
            </td>
            <td><%= vo.getWriter() %></td>
            <td><%= vo.getRdt() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>