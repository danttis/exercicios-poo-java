import java.util.Scanner;


public class Retangulo {
     int l;
     int a;
     Scanner xScanner = new Scanner(System.in);
    public void ler(){
        System.out.println("Digite a largura: ");
        l = xScanner.nextInt();
        System.out.println("Digite a altura: ");
        a = xScanner.nextInt();
        System.out.println("A area do retangulo é: "+ l*a);
    }
   
    
}
