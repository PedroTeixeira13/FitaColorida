package Fita;

import java.util.Random;

public class Teste {

    public static void main(String[] args) {
        Random random = new Random();

        double numeroAleatorio = random.nextDouble();

        // Subtraímos 1.0 para obter um número entre -1 e 0.
        System.out.println(numeroAleatorio - 1.0);
    }
}
