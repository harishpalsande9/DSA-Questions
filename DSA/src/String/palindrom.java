package String;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  str = sc.nextLine();
        if(isPalindrom(str)){
            System.out.println(str + " is a palindrome.");

        }else{
            System.out.println(str + " is not a palindrome.");

        }

    }

    public static boolean isPalindrom(String s){
        int start = 0;
        int end = s.length() - 1;

        while( start > end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
