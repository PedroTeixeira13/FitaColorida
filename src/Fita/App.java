package Fita;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int tam;
        int[] fita;
        int[] dist;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho da fita?");
        tam = sc.nextInt();

        fita = new int[tam];
        dist = new int[tam];

        for(int i = 0; i < fita.length; i++) {
            System.out.print("\nEntre com valor -1 ou 0: ");
            fita[i] = sc.nextInt();
        }
        sc.close();

        //insere qualquer coisa em dist
        for (int i = 0; i < dist.length; i++) {
            dist[i] = 666;
        }

        //transforma em 0 quando a distância é 0
        for(int i = 0; i < fita.length; i++) {
            if (fita[i] == 0) {
                dist[i] = 0;
                for (int j = 0; j < dist.length; j++) {
                    dist[j] = dist[i] - dist[j];
                }
            }
        }

        /*for (int i = 0; i < dist.length; i++) {
            if (fita[i] == -1) {
                for (int j = 0; j < dist.length; j++) {
                    
                }
            }
        }*/

        for (int i = 0; i < fita.length; i++) {
            System.out.printf(" [%s] ", dist[i]);
        }
    }
}
