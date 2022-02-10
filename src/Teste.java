import java.util.Scanner;

public class Teste{
        public static void main(String[] arg) {
            int n1;
            Scanner numero = new
                    Scanner(System.in);
            System.out.println("Digite um numero: ");

            n1 = numero.nextInt();
            if(n1<10) {
                System.out.printf("italo é gay");
            }
            else{
                System.out.printf("Italo é pai do joão");
            }
        }
}