package String;

import java.util.Scanner;

public class PalindromicSubstrings {

    public  static  boolean isPalindrome(String str){

        int i = 0;
        int j = str.length() - 1;

        while (i <= j){
            int ch1 = str.charAt(i);
            int ch2 = str.charAt(j);

            if(ch1 != ch2){
                return  false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void solution(String a1){
        for (int i = 0; i < a1.length(); i++) {
            for (int j = i + 1; j <= a1.length(); j++) {
                String str = a1.substring(i , j );
                if(isPalindrome(str) == true){
                    System.out.println(str);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        solution(a1);

    }

}
