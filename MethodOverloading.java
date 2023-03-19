package com.gradescope.assignment1;

import com.gradescope.assignment1.AbstractMethodOverloading;
import java.lang.Math;

public class MethodOverloading extends AbstractMethodOverloading {
    /*
     * To be filled in by the student
     * Implement all the three overloaded methods here:
     *      Method name : "calculate"
     *      Return type : "double"
     *      And method should be "public" member of the class.
     */

      //area of square
    public double calculate(int a){
        return a*a;
    }
    //area of rectangle
    public double calculate(int a, int b){
        return a*b;
    }
    //area of triangle
    public double calculate(int a, int b, int c){
        double s=(a+b+c)/2;
        double area_square=s*(s-a)*(s-b)*(s-c);
        return Math.sqrt(area_square);
    }
}
