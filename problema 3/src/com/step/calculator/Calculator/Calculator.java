package com.step.calculator.Calculator;
import java.util.Scanner;

public class Calculator{

    public static double adunare(double a, double b)
    {
    return a+b;
    }


    public static double scadere(double a, double b)
    {
        return a-b;
    }

    public static double inmultire(double a, double b)
    {
        return a*b;
    }

    public static double impartire(double a, double b)
    {
        return a/b;
    }
//

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Introduceti a: ");
        double a=sc.nextDouble();
        System.out.println("Introduceti b: ");
        double b=sc.nextDouble();

        System.out.println("Adunarea: "+adunare(a,b));
        System.out.println("Scaderea: "+scadere(a,b));
        System.out.println("Inmultirea: "+inmultire(a,b));
        System.out.println("Impartirea: "+impartire(a,b));

    }
}
