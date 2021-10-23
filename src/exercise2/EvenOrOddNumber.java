package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a = n%2;
        if (a == 0){
        System.out.println("Number is even");
        }
        else {
        System.out.println("Number is odd");
        }
        
    }

}
