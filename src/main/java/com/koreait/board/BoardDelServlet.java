package com.koreait.board;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/del")
public class BoardDelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String strIboard = req.getParameter("iboard");
        System.out.println("strIboard : " + strIboard);
        int iboard = Integer.parseInt(strIboard);

        int result = BoardDAO.delBoard(iboard);
        switch (result) {
            case 1:
                res.sendRedirect("/list");
                break;
        }
    }
}