package Array;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isPalindrome(arr));


    }


    public static boolean isPalindrome(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
