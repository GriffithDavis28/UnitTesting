
public class test {

    public static void main(String[] args) {
        lowerToUpper("griffith");
    }
    

    public static void lowerToUpper(String s){
        for(int i = 0; i < s.length(); i++){
        if(isLetter(s.charAt(i)) && isLower(s.charAt(i)))
        {
            System.out.println((char) (s.charAt(i) - 32));
        }
        else
        {
            System.out.println(s.charAt(i));
        }
        }
    }

    public static boolean isLetter(char s){
        if(s >= 97 && s<=122 || s>= 65 && s<=98){
            return true;
        }
        return false;
    }

    public static boolean isLower(char s){
        if(s >= 97 && s<=122){
            return true;
        }
        return false;
    }
}