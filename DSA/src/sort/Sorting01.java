package sort;

import java.util.Scanner;

public class Sorting01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }


        int zeroCount = 0;
        int oneCount = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                zeroCount++;
            }
            if(arr[i] == 1){
                oneCount++;
            }
        }


        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }

        for (int i = zeroCount; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " == ");
        }
    }
}
