package com.koreait.board;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/detail")
public class BoardDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String strIboard = req.getParameter("iboard");
        int iboard = Integer.parseInt(strIboard);

        BoardVO param = new BoardVO();
        param.setIboard(iboard);
        BoardVO data = BoardDAO.selBoardDetail(param);
        int prevIboard = BoardDAO.selPrevIboard(param); //0
        int nextIboard = BoardDAO.selNextIboard(param); //79

        req.setAttribute("bbb", data);
        req.setAttribute("prevIboard", prevIboard);
        req.setAttribute("nextIboard", nextIboard);

        String path = "/WEB-INF/jsp/detail.jsp";
        req.getRequestDispatcher(path).forward(req, res);
    }
}