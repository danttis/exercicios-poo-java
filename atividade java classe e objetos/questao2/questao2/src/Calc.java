import java.util.Scanner;

public class Calc {
    Scanner scan = new Scanner(System.in);
    int x1;
    int x2;
    public void calcular(){        
        System.out.println("Digite o primeiro valor: ");
        x1= scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        x2= scan.nextInt();
        System.out.println("Soma: "+(x1+x2)+"\nSubtração x1 - x2: "+(x1-x2)+"\nSubtração x2 - x1: "+(x2 - x1)+"\nMultiplicação: "+x1*x2+"\nDivisao x1/x2: "+ (double)(x1/x2) + "\nDivisao x2/x1: " +(double)(x2/x1) );
    }
}