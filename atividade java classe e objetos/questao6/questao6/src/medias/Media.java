package medias;
import java.util.Scanner;

public class Media {
    
    private Scanner scan = new Scanner(System.in);

    public void calcularMedias(int x){
        double notas[] = new double[x];
        for(int i = 0; i < x ; i++){
            System.out.println("Digite a primeira nota do aluno "+(i+1));
            notas[i] = scan.nextDouble();
            System.out.println("Digite a segunda nota do aluno "+(i+1));
            notas[i] += scan.nextDouble();
        }
        for(int i = 0; i < x ; i++){
            System.out.println("A media do aluno "+ (i+1)+ " : "+(notas[i]/2));
        }
    }
    
}