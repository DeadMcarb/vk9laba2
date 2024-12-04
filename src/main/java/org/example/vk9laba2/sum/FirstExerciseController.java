package org.example.vk9laba2.aaaaaaaaaaaaaaaaaaaaaa.sum;




public class FirstExerciseController {

    public FirstExerciseResult calculate(double x, int n, double e) {

        SumOfTerms calcFunction = new SumOfTerms();
        double sum = calcFunction.getSum(x, n);
        double sumOfElementsBiggerThanE = calcFunction.getSumOfElementsBiggerThanE(x, n, e);
        double difference = calcFunction.compare(x, n);

        return new FirstExerciseResult(sum, sumOfElementsBiggerThanE, difference, x, n, e);
    }
}