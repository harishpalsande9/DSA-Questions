package Array;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        int arr[] = new int[num];
//
//        for (int i = 0; i < num; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//        int start = 0;
//        int end = num - 1;
//
//        while (start <= end ){
//
//            int temp = arr[start];
//
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//        }
//
//        for (int i = 0; i < num; i++) {
//            System.out.print(arr[i] + " ");
//        }


        int orignal = num;
        int rem ;
        int newnum = 0 ;



        while(num > 0){
            rem = num % 10;
            newnum=(newnum*10)+rem;
            num = num / 10;
        }

        System.out.println(newnum + " ");

        if(orignal == newnum){
            System.out.println(" Palendrom Number");

        }else{
            System.out.println("Not Palendrom Number");
        }


    }
}
