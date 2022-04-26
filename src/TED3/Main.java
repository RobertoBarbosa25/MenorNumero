package TED3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[10];
        Double maior = 0.0;
        Double menor = 0.0;
        Double media;
        int numHomem = 0;
        int numMulher = 0;
        Double total = 0.0;
        int naoDef = 0;

        for (int i = 0; i < 10; i++) {

            Pessoa pessoa = new Pessoa();
            System.out.println("Informe a Altura " +(i+1)+ ": ");
            pessoa.setAltura(scan.nextDouble());
            System.out.println("Informe o Sexo (m ou f) " +(i+1)+ ": ");
            pessoa.setSexo(scan.next().charAt(0));
            pessoas[i] = pessoa;


            if (menor == 0 && i == 0){
                menor = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura() < menor) {
                menor = pessoas[i].getAltura();
            }
            if (maior == 0){
                maior = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura() > maior) {
                maior = pessoas[i].getAltura();
            }
            if (pessoas[i].getSexo() == 'm' || pessoas[i].getSexo() == 'M' ){
                total += pessoas[i].getAltura();
                numHomem++;
            }
            else
                if (pessoas[i].getSexo() == 'f' || pessoas[i].getSexo() == 'F' ){
                numMulher++;
            }
            else{
                System.out.println("Sexo não inserido!");
                naoDef++;
            }

        }
        media = (total/numHomem);



        System.out.println("A maior altura do grupo é: " +maior);
        System.out.println("A menor altura do grupo é: " +menor);
        System.out.println("A media da altura dos homens é: " +media);
        System.out.println("O total de mulheres é: " +numMulher);
        System.out.println("Existe(m) " +naoDef+ " sexo não informado(s)!");
    }
}
