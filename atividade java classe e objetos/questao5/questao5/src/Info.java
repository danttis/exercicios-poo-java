import java.util.Scanner;

public class Info {
   private int vetor[] = new int[5];
   private int media, menor=0, maior=0;
   private Scanner scan = new Scanner(System.in);

   public void util(){
     for(int i =  0; i < 5; i++){
       System.out.println("Digite " +(i+1)+" elemento");
       vetor[i] = scan.nextInt();
       }
       menor = vetor[0];
       for(int i : vetor){
        if( i<menor ){
            menor = i;
        }
        if(i > maior){
            maior = i;
        }
            media += i;
        }
        System.out.println("Maior numero: "+maior+"\nMenor: "+menor+"\nMedia: "+media/5);
        System.out.println("Numeros pares: ");
        for(int i : vetor){
            if(i%2 == 0)
                System.out.println(i);            
           }
           System.out.println("Numeros impares: ");
        for(int i : vetor){
            if(i%2 != 0)
                System.out.println(i);            
           }
   }

   
    
}