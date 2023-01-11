package Array;

import java.util.Scanner;

public class MajorityElement  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1 ;
        int maxElement = arr[0];
        for (int i = 1; i < num; i++) {

            if(count == 0){
                maxElement = arr[i];
            }

            if( arr[i] == maxElement){
                count++;
            }else {
                count--;
            }
        }

        System.out.println(maxElement + "Max");



//        int count = 1;
//        int maxElement = arr[0];
//        // 11 11 2 2 5 5 5 11 11 11
//        for(int i = 1 ; i < arr.length ; i++){
//
//            if(count == 0){
//                maxElement = arr[i];
//            }
//
//            if(arr[i] == maxElement){
//                count++;
//            }else{
//                count--;
//            }
//
//        }
//
////        return maxElement;
//        System.out.println(maxElement);
    }
}
