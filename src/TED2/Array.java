package TED2;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int menor = 0;
        int maior = 0;
        int soma = 0;
        int pares = 0;
        Scanner scan = new Scanner(System.in);
        int[] valores = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Informe um número: ");
            valores[i] = scan.nextInt();

            if (menor == 0 && i == 0){
                menor = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
            if (maior == 0){
                maior = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }

            soma += valores[i];

            if (valores[i] % 2 == 0){
                pares += valores[i];
            }
        }

        System.out.println("O menor número é: "+menor);
        System.out.println("O maior numero é: "+maior);
        System.out.println("A Soma de  todos os numero: "+soma);
        System.out.println("A Soma de todos os pares: "+pares);

    }
}
