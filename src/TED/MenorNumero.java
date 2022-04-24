package TED;

import java.util.Scanner;
public class MenorNumero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite seu primeiro numero: ");
        int num1 = scn.nextInt();
        System.out.println("Digite seu segundo numero: ");
        int num2 = scn.nextInt();
        System.out.println("Digite seu terceiro numero: ");
        int num3 = scn.nextInt();

        if(num1 < num2 && num1 < num3) {
            System.out.println("O menor numero é: "+num1);
        }else
            if(num2 < num1 && num2 < num3){
                System.out.println("O menor numero é:"+num2);
            }else{
                System.out.println("o menor numero e:"+num3);
            }




    }
}
