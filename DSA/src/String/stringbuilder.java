package String;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("hello");
        System.out.println(sb);

        char ch = sb.charAt(0); //Get
        System.out.println(ch);

        sb.setCharAt(0 , 'd'); // Update
        System.out.println(sb);

        sb.insert(2,'y'); // Insert
        System.out.println(sb);

        sb.deleteCharAt(2); // remove
        System.out.println(sb);

        sb.append('g'); // Append
        System.out.println(sb);

        System.out.println(sb.length()); // Length
    }
}
