import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    private int num, i=1;
    private Scanner scan = new Scanner(System.in);
    private Random  gerador = new Random();
    private int valorSorteado = gerador.nextInt(11);

    public void randomNum(){
        while(num != valorSorteado){
            System.out.println("Tente adivinhar o valor: ");
            num = scan.nextInt();
            if(num != valorSorteado){
               System.out.println("Numero de tentativas: " + i);               
            }
            else
               System.out.println("Parabens");
            i++;
        }
    }
}
