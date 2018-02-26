package edu.ctco.school.exercise5;

/**
 * Why we are able to see protected variable i from class X ?
 *
 * Answer: Because Protected variables and methods accessible inside of the same package
 *
 * What will be printed out, then fixed ?
 *
 * 1221
 */
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new X();

        System.out.println(x.i);

        x.methodOfX();
    }
}