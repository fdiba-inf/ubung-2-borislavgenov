package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = input.nextInt();
        int a = n%2;
        if (a == 0){
        System.out.println("Even");
        }
        else {
        System.out.println("Odd");
        }
        
    }

}
