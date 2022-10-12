import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc;
        int cont = 1;
        Queue<String> fileira = new LinkedList<>();
        sc = new Scanner(new File("./deputadosfederais.txt"));
        while(sc.hasNextLine()){
            fileira.add(sc.nextLine());
        }
        int tamanho = fileira.size();

        for(int i = 0; i < tamanho; i++){
            if(cont == 1){
                System.out.println("***Fileira 1***");
                System.out.println(fileira.poll());
            } else if(cont < 20){
                System.out.println(fileira.poll());
            } else if(cont == 20){
                System.out.println(fileira.poll());
                System.out.println("***Fileira 2***");
            }else if(cont < 40){
                System.out.println(fileira.poll());
            } else if(cont == 40){
                System.out.println(fileira.poll());
                System.out.println("***Fileira 3***");
            } else{
                System.out.println(fileira.poll());
            }
            cont++;
        }
    }
}
