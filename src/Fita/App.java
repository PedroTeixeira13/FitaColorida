package Fita;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int tam = 0, pos;
        int[] fita;
        int[] mostra;

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        while (tam <3 || tam > Math.pow(10, 4)) {
            System.out.println("Qual o tamanho da fita?");
            tam = sc.nextInt();
            sc.close();
        }

        fita = new int[tam];
        mostra = new int[tam];

        for(pos = 0; pos < fita.length; pos++) {
            fita[pos] = r.nextInt(2);
            if (fita[pos] == 1) {
                fita[pos] = 666;
                mostra[pos] = -1;
            } else {
                fita[pos] = 0;
                mostra[pos] = 0;
            }
        }

        
        for (int i = 1; i < fita.length; i++) {
            fita[i] = Math.min(fita[i], Math.min(fita[i - 1] + 1, 9));
        }
        for (int i = fita.length - 2; i >= 0; i--) {
            fita[i] = Math.min(fita[i], Math.min(fita[i + 1] + 1, 9));
        }

        System.out.println("\nFita com posição dos quadrados coloridos aleatoriamente: \n");
        for (int i = 0; i < mostra.length; i++) {
            System.out.printf(" [%s] ", mostra[i]);
        }

        System.out.println("\n\nFita com com a distância para o quadrado previamente colorido mais próximo: \n");
        for (int i = 0; i < fita.length; i++) {
            System.out.printf(" [%s] ", fita[i]);
        }
    }
}