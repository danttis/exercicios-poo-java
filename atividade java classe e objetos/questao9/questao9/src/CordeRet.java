import java.util.Scanner;

public class CordeRet{
   private int vet[] = new int[4];
   private int vet2[] = new int[4];
   private Scanner scan = new Scanner(System.in);

   public void calc(){
    for(int i = 0; i  < 2 ; i++){
        System.out.println("Digite as posisoes "+ (i != 0 ? "esquerda" : "direita")+"do retangulo 1");
        vet[i] = scan.nextInt();
        vet[i+1] = scan.nextInt();
    }
    for(int i = 0; i  < 2 ; i++){
        System.out.println("Digite as posisoes "+ (i != 0 ? "esquerda" : "direita")+"do retangulo 2");
        vet2[i] = scan.nextInt();
        vet2[i+1] = scan.nextInt();
    }
     if(vet[0]==vet2[0] && vet[1]==vet2[1] && vet[2]==vet2[2] && vet[3]==vet2[3] )
        System.out.println("Os retangulos se sobrepoem");
     else
        System.out.println("Nao se sobrepoem");
   }
}