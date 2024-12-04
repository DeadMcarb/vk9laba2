package org.example.vk9laba2.aaaaaaaaaaaaaaaaaaaaaa.tab;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.vk9laba2.aaaaaaaaaaaaaaaaaaaaaa.model.Command;


import java.io.IOException;

public class SecondExerciseCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double h = Double.parseDouble(request.getParameter("h"));

        SecondExerciseController controller = new SecondExerciseController();
        SecondExerciseResult result = controller.calculate(a, b, h);
        request.setAttribute("result", result);
        try {
            request.getRequestDispatcher("/tabulation.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}