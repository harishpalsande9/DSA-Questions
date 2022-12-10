package String;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String a1 = sc.nextLine();
        //String a2 = sc.next();

//        String a1a2 = a1 + " " +  a2;
//        System.out.println(a1a2);
//        Add Two String

//        System.out.println("hello" + 15 + 10);

//
//        System.out.println(a1);
//        System.out.println(a2);

//        System.out.println(a1 + "String");
//        System.out.println(a1.length() + "Length Of String");

//
//        char ch = a1.charAt(0);
//        System.out.println(ch);

//
//        for (int i = 0; i < a1.length(); i++) {
//            char ch =  a1.charAt(i);
//            System.out.println(ch);
//        }

//       Sub String

//        System.out.println(a1.substring( 1 , 3));
//
//        for (int i = 0; i < a1.length(); i++) {
//            for (int j = i + 1; j <= a1.length(); j++) {
//                System.out.println(a1.substring(i , j));
//            }
//        }



//        Split

        String s = "abc,def,ghi,gklm np";

        String [] part = s.split(",");

        for (int i = 0; i < part.length; i++) {
            System.out.println(part[i]);
        }



    }
}
