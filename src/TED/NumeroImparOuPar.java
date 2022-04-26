package TED;
import java.util.Scanner;
import java.util.Arrays;
public class NumeroImparOuPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] valores = new int[4];
        int x = 0;
        int y = 0;

        for (int i = 0; i < 4; i++) {

            System.out.println("Informe um número inteiro: ");
            valores[i] = scan.nextInt();
            if (valores[i] % 2 == 0){
                x++;
            }
            else{
                y++;
            }
        }

        int[] pares = new int[x];
        int[] impares = new int[y];
        x=0;
        y=0;
        for (int i = 0; i < 4; i++) {

            if (valores[i] % 2 == 0){
                pares[x]= valores[i];
                x++;
            }
            else{
                impares[y]= valores[i];
                y++;
            }

        }

        System.out.println("Foram digitados os seguintes numeros pares: "+Arrays.toString(pares));
        System.out.println("Foram digitados os seguintes numeros impares: "+Arrays.toString(impares));
        System.out.println("foram " +y+ " numeros impares.");
        System.out.println("foram " +x+ " numeros pares.");
    }

}
