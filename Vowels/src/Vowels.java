public class Vowels {

    public static int getCount(String str) {
        int numberVowels = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < vowels.length(); j++){
                if (str.charAt(i) == vowels.charAt(j)){
                    numberVowels += 1;
                }
            }
        }
        return numberVowels;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }
}