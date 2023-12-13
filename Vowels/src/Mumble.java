public class Mumble {

    public static String accum(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++){
            result += Character.toUpperCase(s.charAt(i));
            for (int j = 0; j < i; j++){
                result += Character.toLowerCase(s.charAt(i));
            }
            if (i != s.length() - 1){
                result += "-";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }
}
