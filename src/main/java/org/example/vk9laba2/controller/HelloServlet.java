package org.example.vk9laba2.aaaaaaaaaaaaaaaaaaaaaa.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.vk9laba2.aaaaaaaaaaaaaaaaaaaaaa.sum.FirstExerciseCommand;
import org.example.vk9laba2.aaaaaaaaaaaaaaaaaaaaaa.tab.SecondExerciseCommand;


import java.io.IOException;

@WebServlet(name = "HelloServlet" , value = {"/calculate", "/tabulate"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        switch (request.getServletPath()) {
            case ("/calculate"):
                new FirstExerciseCommand().execute(request, response);
                break;
            case ("/tabulate"):
                new SecondExerciseCommand().execute(request, response);
                break;
        }


    }
}