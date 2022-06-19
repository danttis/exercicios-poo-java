import java.util.Scanner;

public class Primo {
    private Scanner scan = new Scanner(System.in);
    private int valor;

    public void listarprimo(){
        System.out.println("Digite o numero limite da lista de primos: ");
        valor = scan.nextInt();
        for(int i = 0 ; i <= valor; i++){            
            if(i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0){
                System.out.println(i);
            }
        }
    }
}
