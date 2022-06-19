import java.util.Scanner;

public class ProdutoVetorial{
 private int veto1[] = new int[5];
 private int veto2[] = new int[5];
 private int pprod;
 private Scanner scan = new Scanner(System.in);
 

 public void produto(){
    for(int i = 0 ; i < 10 ; i++){
        if(i<5){
            System.out.println("Digite o elemento: "+(i+1)+" do primeiro vetor\n");
            veto1[i] = scan.nextInt();
        }
        else{
            System.out.println("Digite o elemento: "+(i-4)+" do segundo vetor\n");
            veto2[i-5] = scan.nextInt();
        }
    }
    for(int j = 0 ; j < 5 ; j++){
          pprod += veto1[j] * veto2[2];
    }
    System.out.println("O produto vetorial é : "+pprod);
 }
}