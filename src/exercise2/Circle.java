package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = input.nextDouble();

        System.out.println("Area: " + Math.PI*(r*r));
        System.out.println("Circumference: " + 2*Math.PI*r);
    }

}
