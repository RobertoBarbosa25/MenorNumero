package TED;
import java.util.Scanner;
public class NumeroImparOuPar {
    public static void main(String[] args){
        int contador = 0;
        int totalImpar = 0;
        int totalPar = 0;


        Scanner scn = new Scanner(System.in);
        while(contador < 5){
            System.out.println("Digite um numero: " +contador);
            int numero = scn.nextInt();
            contador++;

            if(numero % 2 == 0){
                System.out.println("O Numero digitado é PAR");
                totalPar++;

            }else{
                System.out.println("O Numero digitado é IMPAR");
                totalImpar++;
            }

        }
        System.out.println("O número total de número impares são: "+totalImpar);
        System.out.println("O número total de número pares são: "+totalPar);
    }
}
