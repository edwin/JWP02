package com.ubl.jwp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edwin < edwinkun at gmail dot com >
 */
public class ActionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Masuk Ke GET</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Masuk Ke GET </h1>");
        out.println("</br>");
        out.println("parameter nama = " + request.getParameter("nama"));
        out.println("</br>");
        out.println("parameter alamat = " + request.getParameter("alamat"));
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Masuk Ke POST</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Masuk Ke POST</h1>");
        out.println("</br>");
        out.println("parameter nama = " + request.getParameter("nama"));
        out.println("</br>");
        out.println("parameter alamat = " + request.getParameter("alamat"));
        out.println("</body>");
        out.println("</html>");
    }
}
