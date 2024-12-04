package org.example.vk9laba2.aaaaaaaaaaaaaaaaaaaaaa.tab;


public class SecondExerciseController {


    public SecondExerciseResult calculate(double a, double b, double h) {
        Tabulation calcFunction = new Tabulation();
        calcFunction.calculate(a, b, h);

        double[] xArr = calcFunction.getXArr();
        double[] yArr = calcFunction.getYArr();

        return new SecondExerciseResult(xArr, yArr, a, b, h);
    }


}