import java.util.Scanner;

public class CalcInclina {
    private int vetor[] = new int[2];
    private  double tangente;
    private Scanner scan = new Scanner(System.in);

    public void calc(){
       System.out.println("Digite a cordenada x do vetor");
       vetor[0] = scan.nextInt();
       System.out.println("Digite a cordenada y do vetor");
       vetor[1] = scan.nextInt();
       tangente = vetor[1]/vetor[0];
       System.out.println("O angulo de inclinacao e : " +Math.atan(tangente)+"º");
    }
}