
public class test {

    public static void main(String[] args) {
        lowerToUpper("griffith");
        lowerToUpper("GrEgOrY");
        lowerToUpper("s");
    }
    

    public static void lowerToUpper(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
        if(isLetter(s.charAt(i)) && isLower(s.charAt(i)))
        {
            char c = (char) (s.charAt(i) -32);
            sb.append(c);
        }
        else
        {
            sb.append(s.charAt(i));
        }
        }
        System.out.println(sb.toString());
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