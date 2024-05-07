public class test {

    public static void main(String[] args) {
        System.out.println(tc1());
        System.out.println(tc2());
        System.out.println(tc3());
        System.out.println(tc4());
    }

    public static String lowerToUpper(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isLetter(s.charAt(i)) && isLower(s.charAt(i))) {
                char c = (char) (s.charAt(i) - 32);
                sb.append(c);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean isLetter(char s) {
        if (s >= 97 && s <= 122 || s >= 65 && s <= 98) {
            return true;
        }
        return false;
    }

    public static boolean isLower(char s) {
        if (s >= 97 && s <= 122) {
            return true;
        }
        return false;
    }


    /*Test case to check if the sting is being converted to Upper Case */
    public static boolean tc1(){
        String expected = "GRIFFITH";
        String input1 = "griffith";
        String result = lowerToUpper(input1);
        if(expected.equals(result))
        {
            return true;
        }
        else
        return false;
    }


    /*Test case to check for an empty string*/
    public static boolean tc2()
    {
        String expected = "";
        String input2 = "";
        String res = lowerToUpper(input2);
        if(expected.equals(res))
        {
            return true;
        }
        else
        return false;
    }

    /*Test case to check conversion of string including special characters and numbers */
    public static boolean tc3()
    {
        String expected = "GRIFFITH@123";
        String input3="griffith@123";
        String result = lowerToUpper(input3);
        if (expected.equals(result)) {
            return true;
        }
        else
        return false;
    }

    /*Test case to check conversion of a string that also has numbers */
    public static boolean tc4()
    {
        String expected = "HELLO123";
        String input = "Hello123 ";
        String result = lowerToUpper(input);
        if (expected.equals(result)) {
            return true;
        }
        return false;
    }
}