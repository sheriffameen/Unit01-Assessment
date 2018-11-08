package org.pursuit;

public class Overloader {

    public double doubleDivision(int firstDouble, int secondDouble){
        double v = (firstDouble / secondDouble);
        return v;
    }
    //* `doubleDivision`, which accepts one parameter of type `int` and another parameter of type `double`, stores both parameters as `double` values, divides the first parameter by the second parameter, and returns the result as a `double` value

    public double doubleDivision(int firstInt, double firstDouble){
        double s = firstInt / firstDouble;
        return s;
    }

    //* `doubleDivision`, which accepts one parameter of type `double` and another parameter of type `int`, stores both parameters as `double` values, divides the first parameter by the second parameter, and returns the result as a `double` value

    public double doubleDivision (double firstDouble, int firstInt){
        double s = firstDouble/ firstInt;
        return s;
    }
    //* `doubleDivision`, which accepts two parameters of type `double`, stores both parameters as `double` values, divides the first parameter by the second parameter, and returns the result as a `double` value

    public double doubleDivision (double firstDouble, double secondDouble){
        double s = firstDouble/ secondDouble;
        return s;
    }
}
