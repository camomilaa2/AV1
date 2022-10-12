import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<PostRedeSocial> deque = new LinkedList<PostRedeSocial>();
        int opcao = 0;
        PostRedeSocial a = null;
        String msg = "", posts = "";
        byte rel = 0;
        Iterator<PostRedeSocial> it;

        while(opcao != 3){
            System.out.println("<1> Cadastrar Post\n" + "\n" + "<2> Visualizar Posts Relevantes\n" + "\n" + "<3> Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite a mensagem: ");
                    msg = sc.nextLine();
                    System.out.println("Digite a relevancia: ");
                    rel = sc.nextByte();
                    a = new PostRedeSocial(msg, rel);
                    if(rel == 1){
                        deque.addFirst(a);
                    } else if(rel == 2){
                        deque.addLast(a);
                    }
                    break;
                case 2:
                    for(it = deque.iterator();it.hasNext();){
                        var current = it.next();
                        if(current.getRelevancia() == 1) {
                            System.out.println(current.getMsg());
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("erro!");
                    break;
            }
        }

    }
}
