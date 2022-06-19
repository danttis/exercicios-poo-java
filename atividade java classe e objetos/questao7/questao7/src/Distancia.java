import java.util.Scanner;

public class Distancia{
 private Scanner scan = new Scanner(System.in);
 private int ponto1[] = new int[2]; 
 private int ponto2[] = new int[2];    

 public void dist(){
    for(int i = 0 ; i < 2 ; i++){
        System.out.println("Digite a posição "+ (i+1)+ " do primeio ponto");
        ponto1[i] = scan.nextInt();
        System.out.println("Digite a posição "+ (i+1)+ " do segundo ponto");
        ponto2[i] = scan.nextInt();
    }
    double  b = Math.pow((ponto2[0]-ponto1[0]),2) + Math.pow((ponto2[1]-ponto1[1]),2);
   
    System.out.println("A distancia euclidiana entre os pontos é: " + Math.sqrt(b));
 }
}