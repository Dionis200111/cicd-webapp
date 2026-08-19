package com.example.webapp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println("""
            <!DOCTYPE html>
            <html>
                <head>
                    <title>CI/CD WebApp</title>
                </head>
                <body>
                    <h1>Hello from my CI/CD WebApp!</h1>
                    <p>This application is running inside Tomcat.</p>
                    <p>Deployed using Docker.</p>
                </body>
            </html>
            """);
    }
}