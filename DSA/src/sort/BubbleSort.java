package sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num  = sc.nextInt();

        int arr [] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int  i = 0; i < num ; i++) {
            System.out.print(arr[i] + " " );
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                if (arr[j] > arr[ j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Bubble sort array output");

        for (int  i = 0; i < num ; i++) {
            System.out.print(arr[i] + " " );
        }

        System.out.println("Selection sort array output");

        for (int  i = 0; i < num ; i++) {
            int smallest = i ;
            for (int j = i + 1; j < num; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }




        for (int  i = 0; i < num ; i++) {
            System.out.print(arr[i] + " " );
        }




    }
}
