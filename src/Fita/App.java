package Fita;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int tam, pos, cor;
        int[] fita = {-1, 0, -1, -1, -1, 0, -1};

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        /*System.out.println("Qual o tamanho da fita?");
        tam = sc.nextInt();

        fita = new int[tam];*/

        for(pos = 0; pos < fita.length; pos++) {
            //fita[pos] = r.nextInt(2);
            if (fita[pos] == -1) {
                fita[pos] = 10;
            } else {
                fita[pos] = 0;
            }
        }
        sc.close();
        
        for (int i = 1; i < fita.length; i++) {
            
            fita[i] = Math.min(fita[i], Math.min(fita[i - 1] + 1, 9));
        }

        for (int i = 0; i < fita.length; i++) {
            System.out.printf(" [%s] ", fita[i]);
        }
    }
}