package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfDigit(num));
        sc.close();
    }

    static int sumOfDigit(int num){
        if(num == 0){
            return 0;
        }
        int total = num%10 + sumOfDigit(num/10);

        return total;
    }

}
