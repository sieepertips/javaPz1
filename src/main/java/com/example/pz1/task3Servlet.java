package com.example.pz1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "task3Servlet", value = "/task3Servlet")
public class task3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        int current = 1;
        out.println("<!DOCTYPE html>");
        out.println("<html><head><meta charset=\"UTF-8\"><title>Цифра</title></head><body>");
        out.println("<h1>" + current + "</h1>");
        out.println("<form method=\"post\" action=\"task3\">");
        out.println("<input type=\"hidden\" name=\"current\" value=\"" + current + "\">");
        out.println("<button type=\"submit\">Submit</button>");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        String currentParam = request.getParameter("current");
        int current = 1;
        if (currentParam != null && !currentParam.isEmpty()) {
            try {
                current = Integer.parseInt(currentParam) + 1;
            } catch (NumberFormatException e) {
                current = 1;
            }
        }
        out.println("<!DOCTYPE html>");
        out.println("<html><head><meta charset=\"UTF-8\"><title>Цифра</title></head><body>");
        out.println("<h1>" + current + "</h1>");
        out.println("<form method=\"post\" action=\"task3\">");
        out.println("<input type=\"hidden\" name=\"current\" value=\"" + current + "\">");
        out.println("<button type=\"submit\">Submit</button>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
