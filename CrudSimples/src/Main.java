import pro.projetinho;
import java.util.Scanner;

public class Main {
    public static void main(String[]Args){


        double soma1;
        double roubo = 0;
        projetinho Projeto = new projetinho();

        Scanner sc = new Scanner(System.in);

        /*  System.out.printf("O resultado %d", soma2);*/

        Projeto.entrada(sc);
        Projeto.interfaci(sc);
        Projeto.fim();


    }
}