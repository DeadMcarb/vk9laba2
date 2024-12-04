package org.example.vk9laba2.aaaaaaaaaaaaaaaaaaaaaa.sum;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.vk9laba2.aaaaaaaaaaaaaaaaaaaaaa.model.Command;


import java.io.IOException;

public class FirstExerciseCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        double x = Double.parseDouble(request.getParameter("x"));
        int n = Integer.parseInt(request.getParameter("n"));
        double e = Double.parseDouble(request.getParameter("e"));


        FirstExerciseController controller = new FirstExerciseController();
        FirstExerciseResult result = controller.calculate(x, n, e);
        request.setAttribute("result", result);
        try {
            request.getRequestDispatcher("/sum.jsp").forward(request, response);
        } catch (ServletException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}