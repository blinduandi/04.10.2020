package com.step.App;
import java.lang.ref.PhantomReference;
import java.util.Scanner;
import com.step.comparator.NumbersComparator.NumbersComparator;


public class Main {

    public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);

       System.out.println("Introdu a: ");
        int a=sc.nextInt();
        System.out.println("Introdu b: ");
        int b= sc.nextInt();

        NumbersComparator NC = new NumbersComparator();
        System.out.println("MAximul: "+NC.max(a,b));
        System.out.println("Minimul: "+NC.min(a,b));
    }
}
