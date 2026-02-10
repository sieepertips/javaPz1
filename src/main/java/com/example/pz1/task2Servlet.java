package com.example.pz1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;


public class task2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html><head><meta charset=\"UTF-8\"><title>Форма</title></head><body>");
        out.println("<form method=\"post\" action=\"task2\">");
        out.println("Поле для ввода: ");
        out.println("<input type=\"text\" name=\"P1\">");
        out.println("<button type=\"submit\">Submit</button>");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        String p1Value = request.getParameter("P1");//передаем то же значене в пост что было и в гет
        if (p1Value == null) {
            p1Value = "";
        }
        String repeated = p1Value + p1Value;
        out.println("<!DOCTYPE html>");
        out.println("<html><head><meta charset=\"UTF-8\"><title>Форма</title></head><body>");
        out.println("<form method=\"post\" action=\"task2\">");
        out.println("Поле для ввода: ");
        out.println("<input type=\"text\" name=\"P1\" value=\"" + repeated + "\">");
        out.println("<button type=\"submit\">Submit</button>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
