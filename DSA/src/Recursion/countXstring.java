package Recursion;

import java.util.Scanner;

public class countXstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(count(str));

    }

    static  int count( String str){
        if( str.length() == 0){
            return 0 ;
        }

        if( str.charAt(0) == 'x'){
            return (1 + count(str.substring(1)));
        }

        else{
            return  count(str.substring(1));
        }

    }
}
