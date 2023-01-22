package Recursion;

import java.util.Scanner;

public class counts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        System.out.println(count0(num) + " Count Zero");
        System.out.println(count1(num) + " Count One");
        System.out.println(count7(num) + " Count Seven");
    }


    static  int count0(int num ){
        return num ;
    }

    static  int count1(int num ){
        if(num ==0){
            return 0 ;
        }

        if(num % 10 == 1){
            return 1 + count1( num /10);
        }

        return count1( num / 10);
    }

    static  int count7(int num ){

        if(num == 0){
            return 0;
        }

        if(num % 10 == 7){
            return ( 1 + count7( num / 10));
        }

        return count7(num/10);
    }
}
