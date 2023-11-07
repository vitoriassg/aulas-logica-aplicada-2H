import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Validacao {
    public static boolean validaCPF(String cpf) {
        // Remove caracteres não numéricos do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digito1 = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digito2 = (soma % 11 < 2) ? 0 : 11 - (soma % 11);

        // Verifica se os dígitos verificadores calculados são iguais aos dígitos reais
        return (cpf.charAt(9) - '0' == digito1) && (cpf.charAt(10) - '0' == digito2);
    }

    public static void main(String[] args) {
        String cpf ="420.926.108-99" ;
        if (validaCPF(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }
    }

    public static String cpf(String cpf) {
        return cpf;
    }


}
