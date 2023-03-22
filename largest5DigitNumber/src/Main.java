import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int solve(final String digits) {
        List<String> listaStrings = new ArrayList<>();
        List<Integer> listaInt = new ArrayList<>();

        for (int i = 0; i <= digits.length() - 5; i++){
            String parteDeDigits = digits.substring(i, i+5);
            listaStrings.add(parteDeDigits);
        }

        listaStrings.forEach((string) -> {
            int item = Integer.parseInt(string);
            listaInt.add(item);
        });

        return findMax(listaInt);
    }

    public static int findMax(List<Integer> lista){
        int max = lista.get(0);
        for (int i = 1; i < lista.size(); i++){
            if(lista.get(i) > max){
                max = lista.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve("236598745213698"));
    }

}