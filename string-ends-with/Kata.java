public class Kata {

    public static boolean solution(String str, String ending){

        int tamanhoInicial = str.length();
        int tamanhoFim = ending.length();

        if (tamanhoInicial >= tamanhoFim) {
            return str.substring(tamanhoInicial - tamanhoFim).equals(ending);
        }else if (tamanhoInicial < tamanhoFim){
            return false;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(solution("abc", "bc"));



}
