package Fita;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int tam = 0;
        int[] fita;

        Scanner sc = new Scanner(System.in);

        // pergunta o tamanho desejado para a fita
        System.out.println("Qual o tamanho da fita? (Tamanho mínimo: 3, máximo: 10^4)");
        tam = sc.nextInt();
        fita = new int[tam];

        // adiciona valores manualmente na fita
        for (int i = 0; i < fita.length; i++) {
            System.out.printf("Quadrado %s: Adicione 0 para colorir ou -1 para não colorir: ", i + 1);
            fita[i] = sc.nextInt();
        }
        sc.close();

        // transforma o -1 em algum numero alto
        for (int i = 0; i < fita.length; i++) {
            if (fita[i] == -1) {
                fita[i] = 666;
            }
        }

        // faz a contagem da esquerda para a direita do 0 mais próximo
        for (int i = 1; i < fita.length; i++) {
            fita[i] = Math.min(fita[i], Math.min(fita[i - 1] + 1, 9));
        }
        // faz a contagem da direita para a esquerda do 0 mais próximo, mas sem
        // substituir o que já tinha sido alterado
        for (int i = fita.length - 2; i >= 0; i--) {
            fita[i] = Math.min(fita[i], Math.min(fita[i + 1] + 1, 9));
        }

        System.out.println("\n\nFita com com a distância para o quadrado previamente colorido mais próximo: \n");
        for (int i = 0; i < fita.length; i++) {
            System.out.printf(" [%s] ", fita[i]);
        }
    }
}