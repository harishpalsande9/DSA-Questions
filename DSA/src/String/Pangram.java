package String;

public class Pangram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsdlazydog";

        System.out.println(isPngram(str.toLowerCase()));
    }


    public static boolean isPngram(String str){
        if(str.length() < 26){
            return false;
        }else{
            for (char ch = 'a'; ch < 'z'; ch++) {
                if(str.indexOf(ch) < 0){
                    return false;
                }
            }
        }
        return true;
    }

}
