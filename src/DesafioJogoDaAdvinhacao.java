import java.util.Random;
import java.util.Scanner;

public class DesafioJogoDaAdvinhacao {
    public static void main(String[] args) {
    int numeroDigitado,qtdTentativas;
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        numeroDigitado = gerador.nextInt(100) + 1;
        System.out.println(numeroDigitado);

        for (int i = 10; i >= 1; i--) {
            System.out.println("Informe um número entre 0 e 100");
        }
    }
}
