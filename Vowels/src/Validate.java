import java.util.ArrayList;
import java.util.List;

public class Validate {

    public static boolean validate(String n) {
        StringBuilder result = new StringBuilder();
        int soma = 0;

        if (n.length() % 2 == 0) {
            for (int i = 0; i < n.length(); i++) {
                int digit = Character.getNumericValue(n.charAt(i));

                if (i % 2 == 0) {
                    digit *= 2;

                    if (digit > 9) {
                        digit = digit - 9;
                    }
                }
                result.append(digit);
            }
        } else {
            for (int i = 0; i < n.length(); i++) {
                int digit = Character.getNumericValue(n.charAt(i));

                if (i % 2 != 0) {
                    digit *= 2;

                    if (digit > 9) {
                        digit = digit - 9;
                    }
                }

                result.append(digit);
            }
        }

        for (int j = 0; j < result.length(); j++) {
            soma += Character.getNumericValue(result.charAt(j));
        }

        return soma % 10 == 0;
    }
}