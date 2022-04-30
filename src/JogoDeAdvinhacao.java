import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args) {
    int numeroAleatorio;
    Scanner scan = new Scanner(System.in);
    Random gerador = new Random();
    numeroAleatorio = gerador.nextInt(100) + 1;

        for (int i = 10; i >= 1; i--) {
            System.out.println("Informe um número entre 0 e 100.");
            int numeroDigitado = scan.nextInt();
            if (numeroDigitado <= 0 || numeroDigitado >= 100) {
                System.out.println("O número digitado é inválido, please, digite um valor entre 0 e 100.");
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número aleatório.");
            } else if (numeroDigitado > numeroAleatorio){
                System.out.println("O número digitado é maior que o número aleatório.");
            } else {
                System.out.println("Acertoou!! O número aleatório é " + numeroAleatorio);
                break;
            }
            System.out.println("Restam " + (i-1) + " tentativas.");
        }
    }
}
